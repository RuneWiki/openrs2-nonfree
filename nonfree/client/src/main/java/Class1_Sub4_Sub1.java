import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!al", name = "t", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "I")
	public int anInt356 = -1;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "I")
	public int anInt354 = 0;

	@OriginalMember(owner = "client!al", name = "y", descriptor = "I")
	public int anInt355 = 0;

	@OriginalMember(owner = "client!al", name = "C", descriptor = "I")
	public int anInt359 = 12800;

	@OriginalMember(owner = "client!al", name = "L", descriptor = "I")
	public int anInt365 = -1;

	@OriginalMember(owner = "client!al", name = "A", descriptor = "I")
	public int anInt357 = 12800;

	@OriginalMember(owner = "client!al", name = "B", descriptor = "I")
	public final int anInt358;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!al", name = "E", descriptor = "I")
	public final int anInt361;

	@OriginalMember(owner = "client!al", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Lclient!bb;")
	public final Class16 aClass16_1;

	static {
		new Class34("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt356 = arg4;
		this.anInt358 = arg3;
		this.aBoolean32 = arg5;
		this.anInt365 = arg6;
		this.aString2 = arg1;
		this.anInt361 = arg0;
		this.aString3 = arg2;
		if (this.anInt365 == 255) {
			this.anInt365 = 0;
		}
		this.aClass16_1 = new Class16();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI[II)Z")
	public boolean method316(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(18) Class1_Sub44 local18 = (Class1_Sub44) this.aClass16_1.method410(); local18 != null; local18 = (Class1_Sub44) this.aClass16_1.method419()) {
			if (local18.method5623(arg2, arg0)) {
				local18.method5620(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([IIII)Z")
	public boolean method317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class1_Sub44 local11 = (Class1_Sub44) this.aClass16_1.method410(); local11 != null; local11 = (Class1_Sub44) this.aClass16_1.method419()) {
			if (local11.method5624(arg1, arg2)) {
				local11.method5621(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZ[II)Z")
	public boolean method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class1_Sub44 local11 = (Class1_Sub44) this.aClass16_1.method410(); local11 != null; local11 = (Class1_Sub44) this.aClass16_1.method419()) {
			if (local11.method5619(arg1, arg3, arg0)) {
				local11.method5620(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(B)V")
	public void method320() {
		this.anInt359 = 12800;
		this.anInt355 = 0;
		this.anInt354 = 0;
		this.anInt357 = 12800;
		for (@Pc(23) Class1_Sub44 local23 = (Class1_Sub44) this.aClass16_1.method410(); local23 != null; local23 = (Class1_Sub44) this.aClass16_1.method419()) {
			if (local23.anInt6736 > this.anInt355) {
				this.anInt355 = local23.anInt6736;
			}
			if (this.anInt354 < local23.anInt6723) {
				this.anInt354 = local23.anInt6723;
			}
			if (local23.anInt6739 < this.anInt357) {
				this.anInt357 = local23.anInt6739;
			}
			if (this.anInt359 > local23.anInt6731) {
				this.anInt359 = local23.anInt6731;
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZ)Z")
	public boolean method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(22) Class1_Sub44 local22 = (Class1_Sub44) this.aClass16_1.method410(); local22 != null; local22 = (Class1_Sub44) this.aClass16_1.method419()) {
			if (local22.method5623(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
