import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	public final int anInt3663;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
	public final int anInt3661;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "[I")
	public final int[] anIntArray453;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "[I")
	public final int[] anIntArray452;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "[Z")
	public final boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3663 = arg0;
		@Pc(11) Class1_Sub33 local11 = new Class1_Sub33(arg1);
		this.anInt3661 = local11.method5174();
		this.anIntArray453 = new int[this.anInt3661];
		this.anIntArray452 = new int[this.anInt3661];
		this.aBooleanArray18 = new boolean[this.anInt3661];
		this.anIntArrayArray43 = new int[this.anInt3661][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3661; local38++) {
			this.anIntArray453[local38] = local11.method5174();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt3661; local54++) {
			this.aBooleanArray18[local54] = local11.method5174() == 1;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt3661; local75++) {
			this.anIntArray452[local75] = local11.method5177();
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt3661; local91++) {
			this.anIntArrayArray43[local91] = new int[local11.method5174()];
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt3661; local108++) {
			for (@Pc(112) int local112 = 0; local112 < this.anIntArrayArray43[local108].length; local112++) {
				this.anIntArrayArray43[local108][local112] = local11.method5174();
			}
		}
	}
}
