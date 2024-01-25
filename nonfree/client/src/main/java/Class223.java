import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class223 {

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "Lclient!fu;")
	private Class6_Sub2 aClass6_Sub2_44;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "[Lclient!fu;")
	private final Class6_Sub2[] aClass6_Sub2Array1;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
	private final int anInt6214;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V")
	public Class223(@OriginalArg(0) int arg0) {
		this.aClass6_Sub2Array1 = new Class6_Sub2[arg0];
		this.anInt6214 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[local10] = new Class6_Sub2();
			local20.aClass6_Sub2_61 = local20;
			local20.aClass6_Sub2_62 = local20;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(JB)Lclient!fu;")
	public Class6_Sub2 method5319(@OriginalArg(0) long arg0) {
		this.aLong174 = arg0;
		@Pc(20) Class6_Sub2 local20 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt6214 - 1) & arg0)];
		for (this.aClass6_Sub2_44 = local20.aClass6_Sub2_62; this.aClass6_Sub2_44 != local20; this.aClass6_Sub2_44 = this.aClass6_Sub2_44.aClass6_Sub2_62) {
			if (this.aClass6_Sub2_44.aLong247 == arg0) {
				@Pc(40) Class6_Sub2 local40 = this.aClass6_Sub2_44;
				this.aClass6_Sub2_44 = this.aClass6_Sub2_44.aClass6_Sub2_62;
				return local40;
			}
		}
		this.aClass6_Sub2_44 = null;
		return null;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!fu;JI)V")
	public void method5320(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass6_Sub2_61 != null) {
			arg0.method7405();
		}
		@Pc(21) Class6_Sub2 local21 = this.aClass6_Sub2Array1[(int) (arg1 & (long) (this.anInt6214 - 1))];
		arg0.aClass6_Sub2_62 = local21;
		arg0.aClass6_Sub2_61 = local21.aClass6_Sub2_61;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
		arg0.aLong247 = arg1;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Lclient!fu;")
	public Class6_Sub2 method5322() {
		if (this.aClass6_Sub2_44 == null) {
			return null;
		}
		@Pc(29) Class6_Sub2 local29 = this.aClass6_Sub2Array1[(int) ((long) (this.anInt6214 - 1) & this.aLong174)];
		while (this.aClass6_Sub2_44 != local29) {
			if (this.aLong174 == this.aClass6_Sub2_44.aLong247) {
				@Pc(41) Class6_Sub2 local41 = this.aClass6_Sub2_44;
				this.aClass6_Sub2_44 = this.aClass6_Sub2_44.aClass6_Sub2_62;
				return local41;
			}
			this.aClass6_Sub2_44 = this.aClass6_Sub2_44.aClass6_Sub2_62;
		}
		this.aClass6_Sub2_44 = null;
		return null;
	}
}
