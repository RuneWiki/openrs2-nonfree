import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class196 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	private int anInt5160;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	private int anInt5164;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "Lclient!l;")
	private Class11 aClass11_16;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	private int anInt5159 = -1;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Z")
	private boolean aBoolean329 = true;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	private final int anInt5161;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	private final int anInt5158;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "[Lclient!il;")
	private final Class115[] aClass115Array1;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	private final int anInt5166;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	private final int anInt5167;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "[Lclient!il;")
	private final Class115[] aClass115Array2;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Lclient!il;")
	private final Class115 aClass115_1;

	static {
		new Class55("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I[Lclient!il;IIII)V")
	public Class196(@OriginalArg(0) int arg0, @OriginalArg(1) Class115[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5161 = arg3;
		this.anInt5158 = arg0;
		this.aClass115Array1 = arg1;
		this.anInt5166 = arg4;
		this.anInt5167 = arg5;
		if (arg1 == null) {
			this.aClass115Array2 = null;
			this.aClass115_1 = null;
		} else {
			this.aClass115Array2 = new Class115[arg1.length];
			this.aClass115_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public void method4081() {
		if (this.aClass115Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass115Array1.length; local10++) {
				this.aClass115Array1[local10].method2543();
			}
		}
		this.aClass11_16 = null;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ya;IZ)Z")
	public boolean method4082(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anInt5159) {
			this.anInt5159 = arg1;
			@Pc(16) int local16 = Static444.method5654(arg1);
			if (arg1 < local16) {
				local16 = Static154.method2310(arg1);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt5164 != local16) {
				this.anInt5164 = local16;
				this.aClass11_16 = null;
			}
			if (this.aClass115Array1 != null) {
				this.anInt5160 = 0;
				@Pc(55) int[] local55 = new int[this.aClass115Array1.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass115Array1.length; local57++) {
					@Pc(64) Class115 local64 = this.aClass115Array1[local57];
					if (local64.method2545(this.anInt5161, this.anInt5166, this.anInt5167, this.anInt5159)) {
						local55[this.anInt5160] = local64.anInt3143;
						this.aClass115Array2[this.anInt5160++] = local64;
					}
				}
				Static31.method417(this.anInt5160 - 1, local55, this.aClass115Array2, 0);
			}
			this.aBoolean329 = true;
		}
		@Pc(126) boolean local126 = false;
		if (this.aBoolean329) {
			this.aBoolean329 = false;
			for (@Pc(137) int local137 = this.anInt5160 - 1; local137 >= 0; local137--) {
				@Pc(148) boolean local148 = this.aClass115Array2[local137].method2548(arg0, this.aClass115_1);
				local126 |= local148;
				this.aBoolean329 |= !local148;
			}
		}
		return local126;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIIIIIIILclient!ya;)V")
	public void method4084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class51 arg8) {
		@Pc(7) int local7 = arg2 + arg1 & 0x3FFF;
		if (this.anInt5158 == -1) {
			arg8.O(arg5, arg6, arg0, arg4, arg3, 0);
		} else {
			@Pc(21) Class203 local21 = Static204.anInterface4_6.method3138(this.anInt5158);
			if (this.aClass11_16 == null && Static204.anInterface4_6.method3140(this.anInt5158)) {
				@Pc(57) int[] local57 = local21.aBoolean361 ? Static204.anInterface4_6.method3142(false, this.anInt5164, 0.7F, this.anInt5158, this.anInt5164) : Static204.anInterface4_6.method3139(0.7F, this.anInt5158, this.anInt5164, this.anInt5164);
				this.aClass11_16 = arg8.method5310(local57, this.anInt5164, this.anInt5164, this.anInt5164);
			}
			if (!local21.aBoolean361) {
				arg8.O(arg5, arg6, arg0, arg4, arg3, 0);
			}
			if (this.aClass11_16 != null) {
				@Pc(90) int local90 = local21.aBoolean361 ? 0 : 1;
				@Pc(96) int local96 = arg7 * arg4 / -4096;
				@Pc(108) int local108;
				for (local108 = local7 * arg4 / 4096 + (arg0 - arg4) / 2; local108 > arg4; local108 -= arg4) {
				}
				while (local96 > arg4) {
					local96 -= arg4;
				}
				while (local108 < 0) {
					local108 += arg4;
				}
				while (local96 < 0) {
					local96 += arg4;
				}
				for (@Pc(149) int local149 = local108 - arg4; local149 < arg0; local149 += arg4) {
					for (@Pc(155) int local155 = local96 - arg4; local155 < arg4; local155 += arg4) {
						this.aClass11_16.s(local149 + arg5, local155 + arg6, arg4, arg4, 1, 0, local90);
					}
				}
			}
		}
		for (@Pc(209) int local209 = this.anInt5160 - 1; local209 >= 0; local209--) {
			this.aClass115Array2[local209].method2546(arg8, arg5, arg6, arg0, arg4, arg7, local7);
		}
	}
}
