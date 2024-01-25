import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class2_Sub7_Sub12 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
	public int anInt4736 = 12800;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
	public int anInt4737 = 12800;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	public int anInt4739 = 0;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "Z")
	public boolean aBoolean351 = true;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
	public int anInt4735 = -1;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
	public int anInt4742 = 0;

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
	public int anInt4745 = -1;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
	public final int anInt4741;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
	public final int anInt4738;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Lclient!vf;")
	public final Class238 aClass238_24;

	static {
		new Class62("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub7_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString43 = arg2;
		this.anInt4741 = arg0;
		this.anInt4735 = arg6;
		this.anInt4745 = arg4;
		this.anInt4738 = arg3;
		this.aBoolean351 = arg5;
		this.aString42 = arg1;
		if (this.anInt4735 == 255) {
			this.anInt4735 = 0;
		}
		this.aClass238_24 = new Class238();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[III)Z")
	public boolean method4258(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class2_Sub12 local11 = (Class2_Sub12) this.aClass238_24.method5795(); local11 != null; local11 = (Class2_Sub12) this.aClass238_24.method5799()) {
			if (local11.method1837(arg0, arg3, arg2)) {
				local11.method1832(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)Z")
	public boolean method4259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub12 local11 = (Class2_Sub12) this.aClass238_24.method5795(); local11 != null; local11 = (Class2_Sub12) this.aClass238_24.method5799()) {
			if (local11.method1831(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIII)Z")
	public boolean method4262(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub12 local11 = (Class2_Sub12) this.aClass238_24.method5795(); local11 != null; local11 = (Class2_Sub12) this.aClass238_24.method5799()) {
			if (local11.method1830(arg1, arg2)) {
				local11.method1838(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "([IIII)Z")
	public boolean method4263(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class2_Sub12 local11 = (Class2_Sub12) this.aClass238_24.method5795(); local11 != null; local11 = (Class2_Sub12) this.aClass238_24.method5799()) {
			if (local11.method1831(arg2, arg1)) {
				local11.method1832(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public void method4264() {
		this.anInt4739 = 0;
		this.anInt4736 = 12800;
		this.anInt4737 = 12800;
		this.anInt4742 = 0;
		for (@Pc(29) Class2_Sub12 local29 = (Class2_Sub12) this.aClass238_24.method5795(); local29 != null; local29 = (Class2_Sub12) this.aClass238_24.method5799()) {
			if (local29.anInt2286 > this.anInt4742) {
				this.anInt4742 = local29.anInt2286;
			}
			if (local29.anInt2288 < this.anInt4737) {
				this.anInt4737 = local29.anInt2288;
			}
			if (this.anInt4736 > local29.anInt2293) {
				this.anInt4736 = local29.anInt2293;
			}
			if (this.anInt4739 < local29.anInt2290) {
				this.anInt4739 = local29.anInt2290;
			}
		}
	}
}
