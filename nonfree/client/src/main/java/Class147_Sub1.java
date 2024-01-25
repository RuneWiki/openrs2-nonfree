import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!lga", name = "M", descriptor = "I")
	private int anInt5858;

	@OriginalMember(owner = "client!lga", name = "L", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!lga", name = "J", descriptor = "[[B")
	private final byte[][] aByteArrayArray13 = new byte[10][];

	@OriginalMember(owner = "client!lga", name = "H", descriptor = "Lclient!jc;")
	private final Class14_Sub21 aClass14_Sub21_5 = new Class14_Sub21((byte[]) null);

	@OriginalMember(owner = "client!lga", name = "K", descriptor = "Lclient!jc;")
	private final Class14_Sub21 aClass14_Sub21_6 = new Class14_Sub21((byte[]) null);

	@OriginalMember(owner = "client!lga", name = "R", descriptor = "Lclient!rg;")
	private final Class310 aClass310_68;

	@OriginalMember(owner = "client!lga", name = "I", descriptor = "I")
	private final int anInt5857;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(ILclient!rg;I)V")
	public Class147_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass310_68 = arg1;
		this.anInt5857 = arg2;
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(B)V")
	public void method5259() {
		if (this.anIntArray324 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			if (this.anIntArray324.length <= local20 + this.anInt5858) {
				return;
			}
			if (this.aByteArrayArray13[local20] == null && this.aClass310_68.method7793(0, this.anIntArray324[local20 + this.anInt5858])) {
				this.aByteArrayArray13[local20] = this.aClass310_68.method7803(0, this.anIntArray324[local20 + this.anInt5858]);
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "([BB)I")
	@Override
	protected int method5247(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(57) int local57;
		@Pc(63) int local63;
		if (this.anIntArray324 == null) {
			if (!this.aClass310_68.method7793(0, this.anInt5857)) {
				return 0;
			}
			@Pc(36) byte[] local36 = this.aClass310_68.method7803(0, this.anInt5857);
			if (local36 == null) {
				throw new IllegalStateException("");
			}
			this.aClass14_Sub21_6.anInt8936 = 0;
			this.aClass14_Sub21_6.aByteArray99 = local36;
			local57 = local36.length >> 1;
			this.anIntArray324 = new int[local57];
			for (local63 = 0; local63 < local57; local63++) {
				this.anIntArray324[local63] = this.aClass14_Sub21_6.method7717(-1978450544);
			}
		}
		if (this.anIntArray324.length <= this.anInt5858) {
			return -1;
		}
		this.method5259();
		this.aClass14_Sub21_6.anInt8936 = 0;
		this.aClass14_Sub21_6.aByteArray99 = arg0;
		do {
			if (this.aClass14_Sub21_6.anInt8936 >= this.aClass14_Sub21_6.aByteArray99.length) {
				this.aClass14_Sub21_6.aByteArray99 = null;
				return arg0.length;
			}
			if (this.aClass14_Sub21_5.aByteArray99 == null) {
				if (this.aByteArrayArray13[0] == null) {
					this.aClass14_Sub21_6.aByteArray99 = null;
					return this.aClass14_Sub21_6.anInt8936;
				}
				this.aClass14_Sub21_5.aByteArray99 = this.aByteArrayArray13[0];
			}
			@Pc(146) int local146 = this.aClass14_Sub21_6.aByteArray99.length - this.aClass14_Sub21_6.anInt8936;
			local57 = this.aClass14_Sub21_5.aByteArray99.length - this.aClass14_Sub21_5.anInt8936;
			if (local146 < local57) {
				this.aClass14_Sub21_5.method7750(local146, this.aClass14_Sub21_6.anInt8936, this.aClass14_Sub21_6.aByteArray99);
				this.aClass14_Sub21_6.aByteArray99 = null;
				return arg0.length;
			}
			this.aClass14_Sub21_6.method7743(this.aClass14_Sub21_5.anInt8936, this.aClass14_Sub21_5.aByteArray99, local57);
			this.aClass14_Sub21_5.aByteArray99 = null;
			this.aClass14_Sub21_5.anInt8936 = 0;
			this.anInt5858++;
			for (local63 = 0; local63 < 9; local63++) {
				this.aByteArrayArray13[local63] = this.aByteArrayArray13[local63 + 1];
			}
			this.aByteArrayArray13[9] = null;
		} while (this.anIntArray324.length > this.anInt5858);
		this.aClass14_Sub21_6.aByteArray99 = null;
		return this.aClass14_Sub21_6.anInt8936;
	}
}
