import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class2_Sub11_Sub18 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "Lclient!va;")
	private Class199 aClass199_28;

	static {
		new Class93("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
		new Class93("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!dg;)V")
	public void method5232(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4421();
			if (local5 == 0) {
				return;
			}
			this.method5234(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BILclient!dg;)V")
	private void method5234(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(18) int local18 = arg1.method4421();
		@Pc(25) int local25;
		if (this.aClass199_28 == null) {
			local25 = Static216.method3815(local18);
			this.aClass199_28 = new Class199(local25);
		}
		for (local25 = 0; local25 < local18; local25++) {
			@Pc(44) boolean local44 = arg1.method4421() == 1;
			@Pc(48) int local48 = arg1.method4463();
			@Pc(57) Class2 local57;
			if (local44) {
				local57 = new Class2_Sub24(arg1.method4409());
			} else {
				local57 = new Class2_Sub42(arg1.method4444());
			}
			this.aClass199_28.method5749(local57, (long) local48);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BII)I")
	public int method5235(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass199_28 == null) {
			return arg1;
		} else {
			@Pc(24) Class2_Sub42 local24 = (Class2_Sub42) this.aClass199_28.method5751((long) arg0);
			return local24 == null ? arg1 : local24.anInt6670;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method5238(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass199_28 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub24 local16 = (Class2_Sub24) this.aClass199_28.method5751((long) arg0);
			return local16 == null ? arg1 : local16.aString24;
		}
	}
}
