import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class1_Sub4_Sub15 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
	public int anInt3239 = 0;

	@OriginalMember(owner = "client!jr", name = "G", descriptor = "Z")
	public boolean aBoolean219 = true;

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	public int anInt3242 = 12800;

	@OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
	public int anInt3247 = 0;

	@OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
	public int anInt3246 = -1;

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
	public int anInt3248 = -1;

	@OriginalMember(owner = "client!jr", name = "V", descriptor = "I")
	public int anInt3249 = 12800;

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
	public final int anInt3244;

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
	public final int anInt3236;

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!jr", name = "Z", descriptor = "Lclient!eb;")
	public final Class42 aClass42_18;

	static {
		new Class106("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub4_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3244 = arg3;
		this.anInt3248 = arg6;
		this.aString24 = arg2;
		this.aBoolean219 = arg5;
		this.anInt3236 = arg0;
		this.aString23 = arg1;
		this.anInt3246 = arg4;
		if (this.anInt3248 == 255) {
			this.anInt3248 = 0;
		}
		this.aClass42_18 = new Class42();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BII)Z")
	public boolean method2974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) Class1_Sub33 local19 = (Class1_Sub33) this.aClass42_18.method1543(); local19 != null; local19 = (Class1_Sub33) this.aClass42_18.method1551()) {
			if (local19.method4380(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(B)V")
	public void method2975() {
		this.anInt3249 = 12800;
		this.anInt3242 = 12800;
		this.anInt3247 = 0;
		this.anInt3239 = 0;
		for (@Pc(32) Class1_Sub33 local32 = (Class1_Sub33) this.aClass42_18.method1543(); local32 != null; local32 = (Class1_Sub33) this.aClass42_18.method1551()) {
			if (local32.anInt4769 > this.anInt3247) {
				this.anInt3247 = local32.anInt4769;
			}
			if (this.anInt3242 > local32.anInt4774) {
				this.anInt3242 = local32.anInt4774;
			}
			if (this.anInt3239 < local32.anInt4778) {
				this.anInt3239 = local32.anInt4778;
			}
			if (local32.anInt4779 < this.anInt3249) {
				this.anInt3249 = local32.anInt4779;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[I)Z")
	public boolean method2979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class1_Sub33 local11 = (Class1_Sub33) this.aClass42_18.method1543(); local11 != null; local11 = (Class1_Sub33) this.aClass42_18.method1551()) {
			if (local11.method4380(arg1, arg0)) {
				local11.method4377(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BII[II)Z")
	public boolean method2982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(21) Class1_Sub33 local21 = (Class1_Sub33) this.aClass42_18.method1543(); local21 != null; local21 = (Class1_Sub33) this.aClass42_18.method1551()) {
			if (local21.method4376(arg0, arg1, arg3)) {
				local21.method4377(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(III[I)Z")
	public boolean method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(22) Class1_Sub33 local22 = (Class1_Sub33) this.aClass42_18.method1543(); local22 != null; local22 = (Class1_Sub33) this.aClass42_18.method1551()) {
			if (local22.method4374(arg1, arg0)) {
				local22.method4378(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}
}
