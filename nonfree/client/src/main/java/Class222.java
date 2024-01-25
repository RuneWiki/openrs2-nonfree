import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class222 {

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "Lclient!as;")
	private Class12_Sub4 aClass12_Sub4_40;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
	private final int anInt6472;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "[Lclient!as;")
	private final Class12_Sub4[] aClass12_Sub4Array1;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(I)V")
	public Class222(@OriginalArg(0) int arg0) {
		this.anInt6472 = arg0;
		this.aClass12_Sub4Array1 = new Class12_Sub4[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class12_Sub4 local20 = this.aClass12_Sub4Array1[local10] = new Class12_Sub4();
			local20.aClass12_Sub4_59 = local20;
			local20.aClass12_Sub4_60 = local20;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Lclient!as;")
	public Class12_Sub4 method5408() {
		if (this.aClass12_Sub4_40 == null) {
			return null;
		}
		@Pc(23) Class12_Sub4 local23 = this.aClass12_Sub4Array1[(int) (this.aLong168 & (long) (this.anInt6472 - 1))];
		while (this.aClass12_Sub4_40 != local23) {
			if (this.aLong168 == this.aClass12_Sub4_40.aLong247) {
				@Pc(35) Class12_Sub4 local35 = this.aClass12_Sub4_40;
				this.aClass12_Sub4_40 = this.aClass12_Sub4_40.aClass12_Sub4_59;
				return local35;
			}
			this.aClass12_Sub4_40 = this.aClass12_Sub4_40.aClass12_Sub4_59;
		}
		this.aClass12_Sub4_40 = null;
		return null;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(JI)Lclient!as;")
	public Class12_Sub4 method5410(@OriginalArg(0) long arg0) {
		this.aLong168 = arg0;
		@Pc(20) Class12_Sub4 local20 = this.aClass12_Sub4Array1[(int) ((long) (this.anInt6472 - 1) & arg0)];
		for (this.aClass12_Sub4_40 = local20.aClass12_Sub4_59; this.aClass12_Sub4_40 != local20; this.aClass12_Sub4_40 = this.aClass12_Sub4_40.aClass12_Sub4_59) {
			if (arg0 == this.aClass12_Sub4_40.aLong247) {
				@Pc(39) Class12_Sub4 local39 = this.aClass12_Sub4_40;
				this.aClass12_Sub4_40 = this.aClass12_Sub4_40.aClass12_Sub4_59;
				return local39;
			}
		}
		this.aClass12_Sub4_40 = null;
		return null;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!as;J)V")
	public void method5411(@OriginalArg(1) Class12_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass12_Sub4_60 != null) {
			arg0.method7959();
		}
		@Pc(26) Class12_Sub4 local26 = this.aClass12_Sub4Array1[(int) (arg1 & (long) (this.anInt6472 - 1))];
		arg0.aClass12_Sub4_59 = local26;
		arg0.aClass12_Sub4_60 = local26.aClass12_Sub4_60;
		arg0.aClass12_Sub4_60.aClass12_Sub4_59 = arg0;
		arg0.aClass12_Sub4_59.aClass12_Sub4_60 = arg0;
		arg0.aLong247 = arg1;
	}
}
