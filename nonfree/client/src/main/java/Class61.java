import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class61 {

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "Lclient!ad;")
	private Class5 aClass5_11 = new Class5(128);

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!ad;")
	public Class5 aClass5_12 = new Class5(64);

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!dn;")
	public final Class56 aClass56_21;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!dn;")
	private final Class56 aClass56_20;

	static {
		new Class175("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;Lclient!dn;)V")
	public Class61(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class56 arg3) {
		this.aClass56_21 = arg3;
		this.aClass56_20 = arg2;
		this.aClass56_20.method1373(36);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public void method1420() {
		@Pc(9) Class5 local9 = this.aClass5_11;
		synchronized (this.aClass5_11) {
			this.aClass5_11.method110();
		}
		local9 = this.aClass5_12;
		synchronized (this.aClass5_12) {
			this.aClass5_12.method110();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	public void method1422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass5_11 = new Class5(arg1);
		this.aClass5_12 = new Class5(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)V")
	public void method1423() {
		@Pc(6) Class5 local6 = this.aClass5_11;
		synchronized (this.aClass5_11) {
			this.aClass5_11.method106(5);
		}
		local6 = this.aClass5_12;
		synchronized (this.aClass5_12) {
			this.aClass5_12.method106(5);
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V")
	public void method1424() {
		@Pc(11) Class5 local11 = this.aClass5_11;
		synchronized (this.aClass5_11) {
			this.aClass5_11.method116();
		}
		local11 = this.aClass5_12;
		synchronized (this.aClass5_12) {
			this.aClass5_12.method116();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Lclient!tn;")
	public Class223 method1426(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_11;
		@Pc(16) Class223 local16;
		synchronized (this.aClass5_11) {
			local16 = (Class223) this.aClass5_11.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass56_20.method1384(36, arg0);
		local16 = new Class223();
		local16.anInt6728 = arg0;
		local16.aClass61_2 = this;
		if (local41 != null) {
			local16.method5276(new Class3_Sub2(local41));
		}
		local16.method5278();
		@Pc(66) Class5 local66 = this.aClass5_11;
		synchronized (this.aClass5_11) {
			this.aClass5_11.method114((long) arg0, local16);
			return local16;
		}
	}
}
