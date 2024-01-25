import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class66 {

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Lclient!ng;")
	private final Class167 aClass167_27 = new Class167(16);

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!ic;")
	private final Class113 aClass113_34;

	static {
		new Class151("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
		new Class151("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class66(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_34 = arg2;
		this.aClass113_34.method2271(29);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public void method1358() {
		@Pc(2) Class167 local2 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3390();
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lclient!mg;")
	private Class157 method1360(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_27;
		@Pc(16) Class157 local16;
		synchronized (this.aClass167_27) {
			local16 = (Class157) this.aClass167_27.method3386((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass113_34.method2274(29, arg0);
		local16 = new Class157();
		if (local33 != null) {
			local16.method3193(new Class1_Sub11(local33));
		}
		@Pc(54) Class167 local54 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public void method1364() {
		@Pc(8) Class167 local8 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3384(5);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!tv;IIII)Lclient!vv;")
	public Class256 method1365(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class181[] local7 = null;
		@Pc(12) Class157 local12 = this.method1360(arg4);
		if (local12.anIntArray213 != null) {
			local7 = new Class181[local12.anIntArray213.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class24 local32 = arg1.method5007(local12.anIntArray213[local22]);
				local7[local22] = new Class181(local32.anInt566, local32.anInt567, local32.anInt575, local32.anInt574, local32.anInt572, local32.anInt571, local32.anInt565, local32.aBoolean42);
			}
		}
		return new Class256(local12.anInt3996, local7, local12.anInt3994, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	public void method1366() {
		@Pc(6) Class167 local6 = this.aClass167_27;
		synchronized (this.aClass167_27) {
			this.aClass167_27.method3389();
		}
	}
}
