import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class253_Sub1 extends Class253 {

	@OriginalMember(owner = "client!rga", name = "J", descriptor = "I")
	private int anInt8541;

	@OriginalMember(owner = "client!rga", name = "Q", descriptor = "[I")
	private int[] anIntArray621;

	@OriginalMember(owner = "client!rga", name = "O", descriptor = "[[B")
	private final byte[][] aByteArrayArray13 = new byte[10][];

	@OriginalMember(owner = "client!rga", name = "P", descriptor = "Lclient!ika;")
	private final Class3_Sub2 aClass3_Sub2_8 = new Class3_Sub2((byte[]) null);

	@OriginalMember(owner = "client!rga", name = "G", descriptor = "Lclient!ika;")
	private final Class3_Sub2 aClass3_Sub2_9 = new Class3_Sub2((byte[]) null);

	@OriginalMember(owner = "client!rga", name = "I", descriptor = "Lclient!ik;")
	private final Class182 aClass182_107;

	@OriginalMember(owner = "client!rga", name = "F", descriptor = "I")
	private final int anInt8543;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(ILclient!ik;I)V")
	public Class253_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass182_107 = arg1;
		this.anInt8543 = arg2;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "([BI)I")
	@Override
	protected int method7301(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (this.anIntArray621 == null) {
			if (!this.aClass182_107.method3986(this.anInt8543, 0)) {
				return 0;
			}
			@Pc(29) byte[] local29 = this.aClass182_107.method3985(0, this.anInt8543);
			if (local29 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub2_9.aByteArray20 = local29;
			this.aClass3_Sub2_9.anInt2178 = 0;
			local50 = local29.length >> 1;
			this.anIntArray621 = new int[local50];
			for (local56 = 0; local56 < local50; local56++) {
				this.anIntArray621[local56] = this.aClass3_Sub2_9.method2028(-14795);
			}
		}
		if (this.anIntArray621.length <= this.anInt8541) {
			return -1;
		}
		this.method7303();
		this.aClass3_Sub2_9.aByteArray20 = arg0;
		this.aClass3_Sub2_9.anInt2178 = 0;
		do {
			if (this.aClass3_Sub2_9.anInt2178 >= this.aClass3_Sub2_9.aByteArray20.length) {
				this.aClass3_Sub2_9.aByteArray20 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub2_8.aByteArray20 == null) {
				if (this.aByteArrayArray13[0] == null) {
					this.aClass3_Sub2_9.aByteArray20 = null;
					return this.aClass3_Sub2_9.anInt2178;
				}
				this.aClass3_Sub2_8.aByteArray20 = this.aByteArrayArray13[0];
			}
			@Pc(146) int local146 = this.aClass3_Sub2_9.aByteArray20.length - this.aClass3_Sub2_9.anInt2178;
			local50 = this.aClass3_Sub2_8.aByteArray20.length - this.aClass3_Sub2_8.anInt2178;
			if (local50 > local146) {
				this.aClass3_Sub2_8.method2064(local146, this.aClass3_Sub2_9.anInt2178, this.aClass3_Sub2_9.aByteArray20);
				this.aClass3_Sub2_9.aByteArray20 = null;
				return arg0.length;
			}
			this.aClass3_Sub2_9.method2068(this.aClass3_Sub2_8.anInt2178, local50, this.aClass3_Sub2_8.aByteArray20);
			this.aClass3_Sub2_8.anInt2178 = 0;
			this.anInt8541++;
			this.aClass3_Sub2_8.aByteArray20 = null;
			for (local56 = 0; local56 < 9; local56++) {
				this.aByteArrayArray13[local56] = this.aByteArrayArray13[local56 + 1];
			}
			this.aByteArrayArray13[9] = null;
		} while (this.anIntArray621.length > this.anInt8541);
		this.aClass3_Sub2_9.aByteArray20 = null;
		return this.aClass3_Sub2_9.anInt2178;
	}

	@OriginalMember(owner = "client!rga", name = "l", descriptor = "(I)V")
	public void method7303() {
		if (this.anIntArray621 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
			if (local12 + this.anInt8541 >= this.anIntArray621.length) {
				return;
			}
			if (this.aByteArrayArray13[local12] == null && this.aClass182_107.method3986(this.anIntArray621[local12 + this.anInt8541], 0)) {
				this.aByteArrayArray13[local12] = this.aClass182_107.method3985(0, this.anIntArray621[local12 + this.anInt8541]);
			}
		}
	}
}
