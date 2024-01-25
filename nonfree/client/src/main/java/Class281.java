import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class281 {

	@OriginalMember(owner = "client!q", name = "f", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!lh;")
	private Class5_Sub5 aClass5_Sub5_51;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	private final int anInt7561;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "[Lclient!lh;")
	private final Class5_Sub5[] aClass5_Sub5Array1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
	public Class281(@OriginalArg(0) int arg0) {
		this.anInt7561 = arg0;
		this.aClass5_Sub5Array1 = new Class5_Sub5[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub5 local20 = this.aClass5_Sub5Array1[local10] = new Class5_Sub5();
			local20.aClass5_Sub5_67 = local20;
			local20.aClass5_Sub5_66 = local20;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Lclient!lh;")
	public Class5_Sub5 method6687() {
		if (this.aClass5_Sub5_51 == null) {
			return null;
		}
		@Pc(21) Class5_Sub5 local21 = this.aClass5_Sub5Array1[(int) (this.aLong189 & (long) (this.anInt7561 - 1))];
		while (this.aClass5_Sub5_51 != local21) {
			if (this.aLong189 == this.aClass5_Sub5_51.aLong274) {
				@Pc(36) Class5_Sub5 local36 = this.aClass5_Sub5_51;
				this.aClass5_Sub5_51 = this.aClass5_Sub5_51.aClass5_Sub5_66;
				return local36;
			}
			this.aClass5_Sub5_51 = this.aClass5_Sub5_51.aClass5_Sub5_66;
		}
		this.aClass5_Sub5_51 = null;
		return null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Lclient!lh;")
	public Class5_Sub5 method6688(@OriginalArg(1) long arg0) {
		this.aLong189 = arg0;
		@Pc(20) Class5_Sub5 local20 = this.aClass5_Sub5Array1[(int) ((long) (this.anInt7561 - 1) & arg0)];
		for (this.aClass5_Sub5_51 = local20.aClass5_Sub5_66; this.aClass5_Sub5_51 != local20; this.aClass5_Sub5_51 = this.aClass5_Sub5_51.aClass5_Sub5_66) {
			if (this.aClass5_Sub5_51.aLong274 == arg0) {
				@Pc(35) Class5_Sub5 local35 = this.aClass5_Sub5_51;
				this.aClass5_Sub5_51 = this.aClass5_Sub5_51.aClass5_Sub5_66;
				return local35;
			}
		}
		this.aClass5_Sub5_51 = null;
		return null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BJLclient!lh;)V")
	public void method6690(@OriginalArg(1) long arg0, @OriginalArg(2) Class5_Sub5 arg1) {
		if (arg1.aClass5_Sub5_67 != null) {
			arg1.method8952();
		}
		@Pc(21) Class5_Sub5 local21 = this.aClass5_Sub5Array1[(int) (arg0 & (long) (this.anInt7561 - 1))];
		arg1.aClass5_Sub5_66 = local21;
		arg1.aClass5_Sub5_67 = local21.aClass5_Sub5_67;
		arg1.aClass5_Sub5_67.aClass5_Sub5_66 = arg1;
		arg1.aLong274 = arg0;
		arg1.aClass5_Sub5_66.aClass5_Sub5_67 = arg1;
	}
}
