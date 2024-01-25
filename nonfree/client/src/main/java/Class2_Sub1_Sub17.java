import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
	public int anInt6738 = 0;

	@OriginalMember(owner = "client!wt", name = "K", descriptor = "Z")
	public boolean aBoolean497 = true;

	@OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
	public int anInt6741 = 12800;

	@OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
	public int anInt6744 = 0;

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
	public int anInt6737 = 12800;

	@OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
	public int anInt6746 = -1;

	@OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
	public int anInt6743 = -1;

	@OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
	public final int anInt6736;

	@OriginalMember(owner = "client!wt", name = "X", descriptor = "I")
	public final int anInt6753;

	@OriginalMember(owner = "client!wt", name = "V", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!wt", name = "Z", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!wt", name = "G", descriptor = "Lclient!sm;")
	public final Class210 aClass210_47;

	static {
		new Class221("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6746 = arg6;
		this.anInt6736 = arg3;
		this.anInt6753 = arg0;
		this.aString65 = arg1;
		this.aBoolean497 = arg5;
		this.aString66 = arg2;
		this.anInt6743 = arg4;
		if (this.anInt6746 == 255) {
			this.anInt6746 = 0;
		}
		this.aClass210_47 = new Class210();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)Z")
	public boolean method5753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class2_Sub11 local16 = (Class2_Sub11) this.aClass210_47.method5035(); local16 != null; local16 = (Class2_Sub11) this.aClass210_47.method5037()) {
			if (local16.method1408(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III[I)Z")
	public boolean method5755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class2_Sub11 local16 = (Class2_Sub11) this.aClass210_47.method5035(); local16 != null; local16 = (Class2_Sub11) this.aClass210_47.method5037()) {
			if (local16.method1409(arg0, arg1)) {
				local16.method1411(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[IIII)Z")
	public boolean method5756(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class2_Sub11 local18 = (Class2_Sub11) this.aClass210_47.method5035(); local18 != null; local18 = (Class2_Sub11) this.aClass210_47.method5037()) {
			if (local18.method1410(arg0, arg2, arg3)) {
				local18.method1404(arg1, arg0, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
	public void method5757() {
		this.anInt6738 = 0;
		this.anInt6741 = 12800;
		this.anInt6737 = 12800;
		this.anInt6744 = 0;
		for (@Pc(25) Class2_Sub11 local25 = (Class2_Sub11) this.aClass210_47.method5035(); local25 != null; local25 = (Class2_Sub11) this.aClass210_47.method5037()) {
			if (local25.anInt1513 < this.anInt6741) {
				this.anInt6741 = local25.anInt1513;
			}
			if (this.anInt6744 < local25.anInt1503) {
				this.anInt6744 = local25.anInt1503;
			}
			if (local25.anInt1510 < this.anInt6737) {
				this.anInt6737 = local25.anInt1510;
			}
			if (local25.anInt1515 > this.anInt6738) {
				this.anInt6738 = local25.anInt1515;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(III[I)Z")
	public boolean method5758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class2_Sub11 local11 = (Class2_Sub11) this.aClass210_47.method5035(); local11 != null; local11 = (Class2_Sub11) this.aClass210_47.method5037()) {
			if (local11.method1408(arg1, arg0)) {
				local11.method1404(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
