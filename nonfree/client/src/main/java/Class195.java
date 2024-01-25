import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class195 {

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "Lclient!cja;")
	private Class5_Sub5 aClass5_Sub5_46;

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "[Lclient!cja;")
	private final Class5_Sub5[] aClass5_Sub5Array1;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
	private final int anInt5158;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(I)V")
	public Class195(@OriginalArg(0) int arg0) {
		this.aClass5_Sub5Array1 = new Class5_Sub5[arg0];
		this.anInt5158 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub5 local20 = this.aClass5_Sub5Array1[local10] = new Class5_Sub5();
			local20.aClass5_Sub5_66 = local20;
			local20.aClass5_Sub5_65 = local20;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(JI)Lclient!cja;")
	public Class5_Sub5 method4398(@OriginalArg(0) long arg0) {
		this.aLong163 = arg0;
		@Pc(20) Class5_Sub5 local20 = this.aClass5_Sub5Array1[(int) ((long) (this.anInt5158 - 1) & arg0)];
		for (this.aClass5_Sub5_46 = local20.aClass5_Sub5_66; this.aClass5_Sub5_46 != local20; this.aClass5_Sub5_46 = this.aClass5_Sub5_46.aClass5_Sub5_66) {
			if (this.aClass5_Sub5_46.aLong312 == arg0) {
				@Pc(41) Class5_Sub5 local41 = this.aClass5_Sub5_46;
				this.aClass5_Sub5_46 = this.aClass5_Sub5_46.aClass5_Sub5_66;
				return local41;
			}
		}
		if (false) {
			Static298.aStringArrayArray3 = null;
		}
		this.aClass5_Sub5_46 = null;
		return null;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IJLclient!cja;)V")
	public void method4401(@OriginalArg(1) long arg0, @OriginalArg(2) Class5_Sub5 arg1) {
		if (arg1.aClass5_Sub5_65 != null) {
			arg1.method9186();
		}
		@Pc(23) Class5_Sub5 local23 = this.aClass5_Sub5Array1[(int) ((long) (this.anInt5158 - 1) & arg0)];
		arg1.aClass5_Sub5_66 = local23;
		arg1.aClass5_Sub5_65 = local23.aClass5_Sub5_65;
		arg1.aClass5_Sub5_65.aClass5_Sub5_66 = arg1;
		arg1.aLong312 = arg0;
		arg1.aClass5_Sub5_66.aClass5_Sub5_65 = arg1;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Lclient!cja;")
	public Class5_Sub5 method4402() {
		if (this.aClass5_Sub5_46 == null) {
			return null;
		}
		@Pc(24) Class5_Sub5 local24 = this.aClass5_Sub5Array1[(int) (this.aLong163 & (long) (this.anInt5158 - 1))];
		while (local24 != this.aClass5_Sub5_46) {
			if (this.aClass5_Sub5_46.aLong312 == this.aLong163) {
				@Pc(49) Class5_Sub5 local49 = this.aClass5_Sub5_46;
				this.aClass5_Sub5_46 = this.aClass5_Sub5_46.aClass5_Sub5_66;
				return local49;
			}
			this.aClass5_Sub5_46 = this.aClass5_Sub5_46.aClass5_Sub5_66;
		}
		this.aClass5_Sub5_46 = null;
		return null;
	}
}
