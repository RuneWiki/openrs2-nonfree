import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class161 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public int anInt5020;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	public int anInt5021;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	public int anInt5024;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!qh;")
	public Class161 aClass161_2;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	public int anInt5032;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	public int anInt5033;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
	public int anInt5034;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
	public int anInt5035;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
	public int anInt5036;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
	public final int anInt5022;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public final int anInt5025;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
	public final int anInt5027;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
	public final int anInt5023;

	static {
		new Class93("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIB)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5022 = arg3;
		this.anInt5025 = arg0;
		this.anInt5027 = arg1;
		this.aByte49 = arg4;
		this.anInt5023 = arg2;
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!qh;I)V")
	public Class161(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		this.aClass161_2 = arg0;
		this.anInt5023 = arg1 + this.aClass161_2.anInt5023;
		this.anInt5027 = arg1 + this.aClass161_2.anInt5027;
		this.anInt5025 = this.aClass161_2.anInt5025;
		this.aByte49 = this.aClass161_2.aByte49;
		this.anInt5022 = arg1 + this.aClass161_2.anInt5022;
	}
}
