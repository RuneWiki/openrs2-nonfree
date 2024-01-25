import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class191 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!cr;")
	private final Class37 aClass37_94 = new Class37(256);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_37;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!fh;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!nf;Lclient!fh;)V")
	public Class191(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass105_Sub1_37 = arg0;
		this.anInterface2_6 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Lclient!ir;")
	public Class44_Sub1 method5102(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass37_94.method915((long) arg0);
		if (local12 != null) {
			return (Class44_Sub1) local12;
		} else if (this.anInterface2_6.method952(arg0)) {
			@Pc(33) Class116 local33 = this.anInterface2_6.method951(arg0);
			@Pc(40) int local40 = local33.aBoolean223 ? 64 : 128;
			@Pc(80) Class44_Sub1 local80;
			if (local33.aBoolean224 && this.aClass105_Sub1_37.method4296()) {
				@Pc(91) float[] local91 = this.anInterface2_6.method948(local40, 0.7F, arg0, local40);
				local80 = new Class44_Sub1(this.aClass105_Sub1_37, 3553, 34842, local40, local40, local33.aByte45 != 0, local91, 6408);
			} else {
				@Pc(59) int[] local59 = this.anInterface2_6.method950(local40, local40, 0.7F, arg0);
				local80 = new Class44_Sub1(this.aClass105_Sub1_37, 3553, 6408, local40, local40, local33.aByte45 != 0, local59, false);
			}
			local80.method1072(local33.aBoolean221, local33.aBoolean222);
			this.aClass37_94.method922((long) arg0, local80);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public void method5103() {
		this.aClass37_94.method919();
	}
}
