import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class156_Sub1 extends Class156 {

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
	private int anInt3807;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "[[B")
	private final byte[][] aByteArrayArray5 = new byte[10][];

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "Lclient!et;")
	private final Class2_Sub20 aClass2_Sub20_5 = new Class2_Sub20((byte[]) null);

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "Lclient!et;")
	private final Class2_Sub20 aClass2_Sub20_6 = new Class2_Sub20((byte[]) null);

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "Lclient!nca;")
	private final Class254 aClass254_83;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
	private final int anInt3806;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(ILclient!nca;I)V")
	public Class156_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass254_83 = arg1;
		this.anInt3806 = arg2;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method3422(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (this.anIntArray292 == null) {
			if (!this.aClass254_83.method6071(this.anInt3806, 0)) {
				return 0;
			}
			@Pc(29) byte[] local29 = this.aClass254_83.method6087(0, this.anInt3806);
			if (local29 == null) {
				throw new IllegalStateException("");
			}
			this.aClass2_Sub20_6.anInt9723 = 0;
			this.aClass2_Sub20_6.aByteArray111 = local29;
			local50 = local29.length >> 1;
			this.anIntArray292 = new int[local50];
			for (local56 = 0; local56 < local50; local56++) {
				this.anIntArray292[local56] = this.aClass2_Sub20_6.method8575();
			}
		}
		if (this.anInt3807 >= this.anIntArray292.length) {
			return -1;
		}
		this.method3425();
		this.aClass2_Sub20_6.aByteArray111 = arg0;
		this.aClass2_Sub20_6.anInt9723 = 0;
		do {
			if (this.aClass2_Sub20_6.anInt9723 >= this.aClass2_Sub20_6.aByteArray111.length) {
				this.aClass2_Sub20_6.aByteArray111 = null;
				return arg0.length;
			}
			if (this.aClass2_Sub20_5.aByteArray111 == null) {
				if (this.aByteArrayArray5[0] == null) {
					this.aClass2_Sub20_6.aByteArray111 = null;
					return this.aClass2_Sub20_6.anInt9723;
				}
				this.aClass2_Sub20_5.aByteArray111 = this.aByteArrayArray5[0];
			}
			@Pc(146) int local146 = this.aClass2_Sub20_6.aByteArray111.length - this.aClass2_Sub20_6.anInt9723;
			local50 = this.aClass2_Sub20_5.aByteArray111.length - this.aClass2_Sub20_5.anInt9723;
			if (local50 > local146) {
				this.aClass2_Sub20_5.method8573(local146, this.aClass2_Sub20_6.anInt9723, this.aClass2_Sub20_6.aByteArray111);
				this.aClass2_Sub20_6.aByteArray111 = null;
				return arg0.length;
			}
			this.aClass2_Sub20_6.method8565(this.aClass2_Sub20_5.aByteArray111, this.aClass2_Sub20_5.anInt9723, local50);
			this.aClass2_Sub20_5.anInt9723 = 0;
			this.aClass2_Sub20_5.aByteArray111 = null;
			this.anInt3807++;
			for (local56 = 0; local56 < 9; local56++) {
				this.aByteArrayArray5[local56] = this.aByteArrayArray5[local56 + 1];
			}
			this.aByteArrayArray5[9] = null;
		} while (this.anInt3807 < this.anIntArray292.length);
		this.aClass2_Sub20_6.aByteArray111 = null;
		return this.aClass2_Sub20_6.anInt9723;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
	public void method3425() {
		if (this.anIntArray292 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 10 && local12 + this.anInt3807 < this.anIntArray292.length; local12++) {
			if (this.aByteArrayArray5[local12] == null && this.aClass254_83.method6071(this.anIntArray292[this.anInt3807 + local12], 0)) {
				this.aByteArrayArray5[local12] = this.aClass254_83.method6087(0, this.anIntArray292[local12 + this.anInt3807]);
			}
		}
		if (-35 != -35) {
			Static241.anInt3808 = 29;
		}
	}
}
