import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class276 {

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!uo;")
	public Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Lclient!qe;")
	public Class267 aClass267_3;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "Lclient!qs;")
	public Class276 aClass276_1;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "Z")
	public boolean aBoolean524;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "B")
	public byte aByte83;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Lclient!mf;")
	public Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Lclient!ou;")
	public Class4_Sub5 aClass4_Sub5_2;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Lclient!uo;")
	public Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "Lclient!ig;")
	public Class144 aClass144_2;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Lclient!ap;")
	public Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Lclient!ou;")
	public Class4_Sub5 aClass4_Sub5_3;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "B")
	public byte aByte87;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "B")
	public byte aByte88;

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "B")
	public byte aByte86 = 0;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "S")
	public final short aShort98;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "B")
	public byte aByte89;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "B")
	public byte aByte85;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "S")
	public final short aShort99;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(III)V")
	public Class276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort98 = (short) arg2;
		this.aByte85 = this.aByte89 = (byte) arg0;
		this.aShort99 = (short) arg1;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method6203() {
		while (this.aClass267_3 != null) {
			@Pc(13) Class267 local13 = this.aClass267_3.aClass267_2;
			this.aClass267_3.method5991();
			this.aClass267_3 = local13;
		}
		this.aByte86 = 0;
	}
}
