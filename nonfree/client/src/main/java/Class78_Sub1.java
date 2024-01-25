import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!dp", name = "F", descriptor = "I")
	private int anInt2374;

	@OriginalMember(owner = "client!dp", name = "I", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!dp", name = "D", descriptor = "[[B")
	private final byte[][] aByteArrayArray3 = new byte[10][];

	@OriginalMember(owner = "client!dp", name = "H", descriptor = "Lclient!rba;")
	private final Class3_Sub28 aClass3_Sub28_3 = new Class3_Sub28((byte[]) null);

	@OriginalMember(owner = "client!dp", name = "L", descriptor = "Lclient!rba;")
	private final Class3_Sub28 aClass3_Sub28_4 = new Class3_Sub28((byte[]) null);

	@OriginalMember(owner = "client!dp", name = "M", descriptor = "I")
	private final int anInt2376;

	@OriginalMember(owner = "client!dp", name = "J", descriptor = "Lclient!lb;")
	private final Class221 aClass221_24;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(ILclient!lb;I)V")
	public Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt2376 = arg2;
		this.aClass221_24 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([BI)I")
	@Override
	protected int method2103(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (this.anIntArray115 == null) {
			if (!this.aClass221_24.method5093(0, this.anInt2376)) {
				return 0;
			}
			@Pc(29) byte[] local29 = this.aClass221_24.method5089(0, this.anInt2376);
			if (local29 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub28_4.anInt6241 = 0;
			this.aClass3_Sub28_4.aByteArray50 = local29;
			local50 = local29.length >> 1;
			this.anIntArray115 = new int[local50];
			for (local56 = 0; local56 < local50; local56++) {
				this.anIntArray115[local56] = this.aClass3_Sub28_4.method5272();
			}
		}
		if (this.anInt2374 >= this.anIntArray115.length) {
			return -1;
		}
		this.method2109();
		this.aClass3_Sub28_4.anInt6241 = 0;
		this.aClass3_Sub28_4.aByteArray50 = arg0;
		do {
			if (this.aClass3_Sub28_4.anInt6241 >= this.aClass3_Sub28_4.aByteArray50.length) {
				this.aClass3_Sub28_4.aByteArray50 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub28_3.aByteArray50 == null) {
				if (this.aByteArrayArray3[0] == null) {
					this.aClass3_Sub28_4.aByteArray50 = null;
					return this.aClass3_Sub28_4.anInt6241;
				}
				this.aClass3_Sub28_3.aByteArray50 = this.aByteArrayArray3[0];
			}
			@Pc(148) int local148 = this.aClass3_Sub28_4.aByteArray50.length - this.aClass3_Sub28_4.anInt6241;
			local50 = this.aClass3_Sub28_3.aByteArray50.length - this.aClass3_Sub28_3.anInt6241;
			if (local148 < local50) {
				this.aClass3_Sub28_3.method5271(this.aClass3_Sub28_4.aByteArray50, local148, this.aClass3_Sub28_4.anInt6241);
				this.aClass3_Sub28_4.aByteArray50 = null;
				return arg0.length;
			}
			this.aClass3_Sub28_4.method5274(local50, this.aClass3_Sub28_3.aByteArray50, this.aClass3_Sub28_3.anInt6241);
			this.aClass3_Sub28_3.aByteArray50 = null;
			this.aClass3_Sub28_3.anInt6241 = 0;
			this.anInt2374++;
			for (local56 = 0; local56 < 9; local56++) {
				this.aByteArrayArray3[local56] = this.aByteArrayArray3[local56 + 1];
			}
			this.aByteArrayArray3[9] = null;
		} while (this.anInt2374 < this.anIntArray115.length);
		this.aClass3_Sub28_4.aByteArray50 = null;
		return this.aClass3_Sub28_4.anInt6241;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(B)V")
	public void method2109() {
		if (this.anIntArray115 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			if (this.anInt2374 + local20 >= this.anIntArray115.length) {
				return;
			}
			if (this.aByteArrayArray3[local20] == null && this.aClass221_24.method5093(0, this.anIntArray115[this.anInt2374 + local20])) {
				this.aByteArrayArray3[local20] = this.aClass221_24.method5089(0, this.anIntArray115[this.anInt2374 + local20]);
			}
		}
	}
}
