import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class310 {

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Lclient!wf;")
	private final Class316 aClass316_62 = new Class316(16);

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "Lclient!kda;")
	private final Class160 aClass160_101;

	static {
		new Class114("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class310(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_101 = arg2;
		this.aClass160_101.method4207(29);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BI)Lclient!f;")
	private Class85 method7427(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_62;
		@Pc(16) Class85 local16;
		synchronized (this.aClass316_62) {
			local16 = (Class85) this.aClass316_62.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class160 local35 = this.aClass160_101;
		@Pc(44) byte[] local44;
		synchronized (this.aClass160_101) {
			local44 = this.aClass160_101.method4198(arg0, 29);
		}
		local16 = new Class85();
		if (local44 != null) {
			local16.method2696(new Class1_Sub13(local44));
		}
		@Pc(66) Class316 local66 = this.aClass316_62;
		synchronized (this.aClass316_62) {
			this.aClass316_62.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public void method7428() {
		@Pc(11) Class316 local11 = this.aClass316_62;
		synchronized (this.aClass316_62) {
			this.aClass316_62.method7803();
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILclient!rl;IIB)Lclient!fj;")
	public Class89 method7429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) Class287[] local13 = null;
		@Pc(18) Class85 local18 = this.method7427(arg0);
		if (local18.anIntArray229 != null) {
			local13 = new Class287[local18.anIntArray229.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(37) Class111 local37 = arg2.method6207(local18.anIntArray229[local28]);
				local13[local28] = new Class287(local37.anInt3667, local37.anInt3672, local37.anInt3673, local37.anInt3665, local37.anInt3669, local37.anInt3668, local37.anInt3670, local37.aBoolean231);
			}
		}
		return new Class89(local18.anInt2897, local13, local18.anInt2893, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public void method7430() {
		@Pc(2) Class316 local2 = this.aClass316_62;
		synchronized (this.aClass316_62) {
			this.aClass316_62.method7794();
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)V")
	public void method7433() {
		@Pc(6) Class316 local6 = this.aClass316_62;
		synchronized (this.aClass316_62) {
			this.aClass316_62.method7791(5);
		}
	}
}
