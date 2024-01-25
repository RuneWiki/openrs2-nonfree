import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class80 {

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "Lclient!ke;")
	private Class5_Sub2 aClass5_Sub2_39;

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "[Lclient!ke;")
	private final Class5_Sub2[] aClass5_Sub2Array1;

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
	private final int anInt2408;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
	public Class80(@OriginalArg(0) int arg0) {
		this.aClass5_Sub2Array1 = new Class5_Sub2[arg0];
		this.anInt2408 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub2 local20 = this.aClass5_Sub2Array1[local10] = new Class5_Sub2();
			local20.aClass5_Sub2_60 = local20;
			local20.aClass5_Sub2_59 = local20;
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)Lclient!ke;")
	public Class5_Sub2 method2208() {
		if (this.aClass5_Sub2_39 == null) {
			return null;
		}
		@Pc(23) Class5_Sub2 local23 = this.aClass5_Sub2Array1[(int) (this.aLong81 & (long) (this.anInt2408 - 1))];
		while (this.aClass5_Sub2_39 != local23) {
			if (this.aLong81 == this.aClass5_Sub2_39.aLong252) {
				@Pc(39) Class5_Sub2 local39 = this.aClass5_Sub2_39;
				this.aClass5_Sub2_39 = this.aClass5_Sub2_39.aClass5_Sub2_60;
				return local39;
			}
			this.aClass5_Sub2_39 = this.aClass5_Sub2_39.aClass5_Sub2_60;
		}
		this.aClass5_Sub2_39 = null;
		return null;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(JLclient!ke;I)V")
	public void method2209(@OriginalArg(0) long arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		if (arg1.aClass5_Sub2_59 != null) {
			arg1.method7323();
		}
		@Pc(21) Class5_Sub2 local21 = this.aClass5_Sub2Array1[(int) ((long) (this.anInt2408 - 1) & arg0)];
		arg1.aClass5_Sub2_60 = local21;
		arg1.aClass5_Sub2_59 = local21.aClass5_Sub2_59;
		arg1.aClass5_Sub2_59.aClass5_Sub2_60 = arg1;
		arg1.aClass5_Sub2_60.aClass5_Sub2_59 = arg1;
		arg1.aLong252 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(JI)Lclient!ke;")
	public Class5_Sub2 method2211(@OriginalArg(0) long arg0) {
		this.aLong81 = arg0;
		@Pc(25) Class5_Sub2 local25 = this.aClass5_Sub2Array1[(int) ((long) (this.anInt2408 - 1) & arg0)];
		for (this.aClass5_Sub2_39 = local25.aClass5_Sub2_60; this.aClass5_Sub2_39 != local25; this.aClass5_Sub2_39 = this.aClass5_Sub2_39.aClass5_Sub2_60) {
			if (arg0 == this.aClass5_Sub2_39.aLong252) {
				@Pc(44) Class5_Sub2 local44 = this.aClass5_Sub2_39;
				this.aClass5_Sub2_39 = this.aClass5_Sub2_39.aClass5_Sub2_60;
				return local44;
			}
		}
		this.aClass5_Sub2_39 = null;
		return null;
	}
}
