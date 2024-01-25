import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class169 {

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "Lclient!ad;")
	private final Class5 aClass5_45 = new Class5(64);

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "Lclient!dn;")
	private final Class56 aClass56_66;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public final int anInt5044;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class169(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_66 = arg2;
		if (this.aClass56_66 == null) {
			this.anInt5044 = 0;
		} else {
			this.anInt5044 = this.aClass56_66.method1373(16);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	public void method4052() {
		@Pc(7) Class5 local7 = this.aClass5_45;
		synchronized (this.aClass5_45) {
			this.aClass5_45.method110();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V")
	public void method4056() {
		@Pc(2) Class5 local2 = this.aClass5_45;
		synchronized (this.aClass5_45) {
			this.aClass5_45.method106(5);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Lclient!qp;")
	public Class194 method4058(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_45;
		@Pc(16) Class194 local16;
		synchronized (this.aClass5_45) {
			local16 = (Class194) this.aClass5_45.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass56_66.method1384(16, arg0);
		local16 = new Class194();
		if (local33 != null) {
			local16.method4793(new Class3_Sub2(local33));
		}
		@Pc(49) Class5 local49 = this.aClass5_45;
		synchronized (this.aClass5_45) {
			this.aClass5_45.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public void method4059() {
		@Pc(10) Class5 local10 = this.aClass5_45;
		synchronized (this.aClass5_45) {
			this.aClass5_45.method116();
		}
	}
}
