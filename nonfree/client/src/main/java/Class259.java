import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class259 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public int anInt7484 = 0;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public int anInt7487 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Lclient!ad;")
	private final Class5 aClass5_64 = new Class5(64);

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!qj;")
	private Interface10 anInterface10_1 = null;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!dn;")
	private final Class56 aClass56_95;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!dn;")
	private final Class56 aClass56_94;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ILclient!dn;Lclient!dn;Lclient!qj;)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Interface10 arg3) {
		this.anInterface10_1 = arg3;
		this.aClass56_95 = arg1;
		this.aClass56_94 = arg2;
		if (this.aClass56_95 != null) {
			this.anInt7484 = this.aClass56_95.method1373(1);
		}
		if (this.aClass56_94 != null) {
			this.anInt7487 = this.aClass56_94.method1373(1);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!qc;")
	public Class3_Sub3_Sub18 method5865(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub3_Sub18 local11 = (Class3_Sub3_Sub18) this.aClass5_64.method104((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = this.aClass56_95.method1384(1, arg0);
		} else {
			local32 = this.aClass56_94.method1384(1, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub3_Sub18();
		local11.aClass259_2 = this;
		if (local32 != null) {
			local11.method4658(new Class3_Sub2(local32));
		}
		if (arg0 >= 32768) {
			local11.method4651();
		}
		this.aClass5_64.method114((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([IJLclient!jd;I)Ljava/lang/String;")
	public String method5867(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class119 arg2) {
		if (this.anInterface10_1 != null) {
			@Pc(14) String local14 = this.anInterface10_1.method3574(arg2, arg1, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg1);
	}
}
