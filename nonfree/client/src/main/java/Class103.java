import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class103 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	private int anInt2506 = -1;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	private int anInt2511 = 0;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Lclient!ub;")
	private Class244 aClass244_11 = new Class244();

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	private final int anInt2504;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
	private final int anInt2512;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "[Lclient!at;")
	private Class4_Sub5[] aClass4_Sub5Array1;

	static {
		new Class15("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(III)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2504 = arg1;
		this.anInt2512 = arg0;
		this.anIntArrayArray31 = new int[this.anInt2512][arg2];
		this.aClass4_Sub5Array1 = new Class4_Sub5[this.anInt2504];
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public void method1975() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2512; local3++) {
			this.anIntArrayArray31[local3] = null;
		}
		this.aClass4_Sub5Array1 = null;
		this.anIntArrayArray31 = null;
		this.aClass244_11.method5264();
		this.aClass244_11 = null;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
	public int[] method1977(@OriginalArg(0) int arg0) {
		if (this.anInt2512 == this.anInt2504) {
			this.aBoolean164 = this.aClass4_Sub5Array1[arg0] == null;
			this.aClass4_Sub5Array1[arg0] = Static452.aClass4_Sub5_1;
			return this.anIntArrayArray31[arg0];
		} else if (this.anInt2512 == 1) {
			this.aBoolean164 = arg0 != this.anInt2506;
			this.anInt2506 = arg0;
			return this.anIntArrayArray31[0];
		} else {
			@Pc(70) Class4_Sub5 local70 = this.aClass4_Sub5Array1[arg0];
			if (local70 == null) {
				this.aBoolean164 = true;
				if (this.anInt2511 < this.anInt2512) {
					local70 = new Class4_Sub5(arg0, this.anInt2511);
					this.anInt2511++;
				} else {
					@Pc(107) Class4_Sub5 local107 = (Class4_Sub5) this.aClass244_11.method5267();
					local70 = new Class4_Sub5(arg0, local107.anInt306);
					this.aClass4_Sub5Array1[local107.anInt305] = null;
					local107.method6059();
				}
				this.aClass4_Sub5Array1[arg0] = local70;
			} else {
				this.aBoolean164 = false;
			}
			this.aClass244_11.method5274(local70);
			return this.anIntArrayArray31[local70.anInt306];
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)[[I")
	public int[][] method1978() {
		if (this.anInt2512 != this.anInt2504) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt2512; local26++) {
			this.aClass4_Sub5Array1[local26] = Static452.aClass4_Sub5_1;
		}
		return this.anIntArrayArray31;
	}
}
