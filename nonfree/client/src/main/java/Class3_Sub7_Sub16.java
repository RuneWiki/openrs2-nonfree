import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class3_Sub7_Sub16 extends Class3_Sub7 {

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public int anInt6358 = -1;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	public int anInt6359 = 0;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	public int anInt6367 = 12800;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "I")
	public int anInt6360 = 0;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
	public boolean aBoolean498 = true;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "I")
	public int anInt6362 = -1;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public int anInt6361 = 12800;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
	public final int anInt6373;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	public final int anInt6364;

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!w", name = "V", descriptor = "Lclient!kr;")
	public final Class138 aClass138_46;

	static {
		new Class57("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub7_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString66 = arg1;
		this.aBoolean498 = arg5;
		this.anInt6373 = arg0;
		this.anInt6358 = arg4;
		this.anInt6364 = arg3;
		this.anInt6362 = arg6;
		this.aString65 = arg2;
		if (this.anInt6362 == 255) {
			this.anInt6362 = 0;
		}
		this.aClass138_46 = new Class138();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[III)Z")
	public boolean method5622(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(21) Class3_Sub9 local21 = (Class3_Sub9) this.aClass138_46.method3051(); local21 != null; local21 = (Class3_Sub9) this.aClass138_46.method3050()) {
			if (local21.method1302(arg0, arg2)) {
				local21.method1300(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public void method5625() {
		this.anInt6360 = 0;
		this.anInt6361 = 12800;
		this.anInt6359 = 0;
		this.anInt6367 = 12800;
		for (@Pc(27) Class3_Sub9 local27 = (Class3_Sub9) this.aClass138_46.method3051(); local27 != null; local27 = (Class3_Sub9) this.aClass138_46.method3050()) {
			if (local27.anInt1582 < this.anInt6361) {
				this.anInt6361 = local27.anInt1582;
			}
			if (local27.anInt1585 > this.anInt6359) {
				this.anInt6359 = local27.anInt1585;
			}
			if (local27.anInt1596 > this.anInt6360) {
				this.anInt6360 = local27.anInt1596;
			}
			if (this.anInt6367 > local27.anInt1591) {
				this.anInt6367 = local27.anInt1591;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIII)Z")
	public boolean method5628(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class3_Sub9 local19 = (Class3_Sub9) this.aClass138_46.method3051(); local19 != null; local19 = (Class3_Sub9) this.aClass138_46.method3050()) {
			if (local19.method1298(arg1, arg2)) {
				local19.method1303(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Z")
	public boolean method5629(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(16) Class3_Sub9 local16 = (Class3_Sub9) this.aClass138_46.method3051(); local16 != null; local16 = (Class3_Sub9) this.aClass138_46.method3050()) {
			if (local16.method1299(arg2, arg1, arg3)) {
				local16.method1300(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) Class3_Sub9 local15 = (Class3_Sub9) this.aClass138_46.method3051(); local15 != null; local15 = (Class3_Sub9) this.aClass138_46.method3050()) {
			if (local15.method1302(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}
}
