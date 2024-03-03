import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class211 {

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
	public static final int[] anIntArray396;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_214;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!hu;")
	private final Class98 aClass98_50 = new Class98(64);

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!hu;")
	public final Class98 aClass98_51 = new Class98(30);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!r;")
	private final Class197 aClass197_82;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!r;")
	public final Class197 aClass197_81;

	static {
		new Class79(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		anIntArray396 = new int[14];
		aClass145_214 = new Class145(31, 3);
		new Class79("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;Lclient!r;)V", line = 167)
	public Class211(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class197 arg3) {
		this.aClass197_82 = arg2;
		this.aClass197_81 = arg3;
		@Pc(26) int local26 = this.aClass197_82.method5093() - 1;
		this.aClass197_82.method5082(local26);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!hf;", line = 7)
	public Class91 method5408(@OriginalArg(0) int arg0) {
		@Pc(6) Class98 local6 = this.aClass98_50;
		@Pc(25) Class91 local25;
		synchronized (this.aClass98_50) {
			local25 = (Class91) this.aClass98_50.method2614((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(48) byte[] local48 = this.aClass197_82.method5090(Static275.method2429(arg0), Static110.method2372(arg0));
		local25 = new Class91();
		local25.aClass211_1 = this;
		local25.anInt2450 = arg0;
		if (local48 != null) {
			local25.method2432(new Class2_Sub4(local48));
		}
		local6 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2626((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 42)
	public void method5409() {
		@Pc(2) Class98 local2 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2623();
		}
		local2 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2623();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 71)
	public void method5411() {
		@Pc(6) Class98 local6 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2616();
		}
		local6 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2616();
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V", line = 89)
	public void method5412() {
		@Pc(14) Class98 local14 = this.aClass98_50;
		synchronized (this.aClass98_50) {
			this.aClass98_50.method2617(5);
		}
		local14 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2617(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V", line = 112)
	public void method5413(@OriginalArg(1) int arg0) {
		this.anInt5946 = arg0;
		@Pc(13) Class98 local13 = this.aClass98_51;
		synchronized (this.aClass98_51) {
			this.aClass98_51.method2616();
		}
	}
}
