import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class133_Sub1_Sub2 extends Class133_Sub1 {

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "Lclient!sl;")
	private Class40_Sub4 aClass40_Sub4_2;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
	private final int anInt5668;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
	private final int anInt5667;

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
	private final int anInt5665;

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
	private final int anInt5666;

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
	private final int anInt5670;

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
	private final int anInt5662;

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_32;

	static {
		new Class231("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!bl;IIIIII)V")
	public Class133_Sub1_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5668 = arg3;
		this.anInt5667 = arg2;
		this.anInt5665 = arg6;
		this.anInt5666 = arg4;
		this.anInt5670 = arg1;
		this.anInt5662 = arg5;
		this.aClass28_Sub1_32 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Lclient!sl;")
	@Override
	public Class40_Sub4 method4772() {
		if (this.aClass40_Sub4_2 == null) {
			Static363.anIntArray537[2] = this.anInt5668;
			Static363.anIntArray537[3] = this.anInt5666;
			Static363.anIntArray537[0] = this.anInt5670;
			Static363.anIntArray537[1] = this.anInt5667;
			Static363.anIntArray537[5] = this.anInt5665;
			@Pc(44) Interface11 local44 = this.aClass28_Sub1_32.anInterface11_6;
			Static363.anIntArray537[4] = this.anInt5662;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local44.method2468(Static363.anIntArray537[local55])) {
					return null;
				}
				@Pc(73) Class229 local73 = local44.method2466(Static363.anIntArray537[local55]);
				@Pc(80) int local80 = local73.aBoolean405 ? 64 : 128;
				if (local73.aByte86 > 0) {
					local51 = true;
				}
				if (local80 > local53) {
					local53 = local80;
				}
			}
			for (@Pc(96) int local96 = 0; local96 < 6; local96++) {
				Static197.anIntArrayArray30[local96] = local44.method2467(local53, false, Static363.anIntArray537[local96], 1.0F, local53);
			}
			this.aClass40_Sub4_2 = new Class40_Sub4(this.aClass28_Sub1_32, 6407, local53, local51, Static197.anIntArrayArray30);
		}
		return this.aClass40_Sub4_2;
	}
}
