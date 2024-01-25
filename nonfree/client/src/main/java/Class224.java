import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class224 {

	@OriginalMember(owner = "client!lia", name = "n", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!lia", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "Lclient!oga;")
	public Class272 aClass272_1;

	@OriginalMember(owner = "client!lia", name = "t", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "[Lclient!oga;")
	public Class272[] aClass272Array1;

	@OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
	public int anInt5834;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!lia", name = "j", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
	public int anInt5835;

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!lia", name = "u", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "[[B")
	public byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!lia", name = "q", descriptor = "I")
	public final int anInt5830;

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "([BI[B)V")
	public Class224(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt5830 = Static552.method4268(arg0.length, arg0);
		if (this.anInt5830 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray76 = Static323.method4463(arg0, 0, arg0.length);
			for (@Pc(41) int local41 = 0; local41 < 64; local41++) {
				if (arg2[local41] != this.aByteArray76[local41]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5226(arg0);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B[B)V")
	private void method5226(@OriginalArg(1) byte[] arg0) {
		@Pc(20) Class2_Sub20 local20 = new Class2_Sub20(Static586.method8131(arg0));
		@Pc(24) int local24 = local20.method8581(-17416);
		if (local24 < 5 || local24 > 7) {
			throw new RuntimeException();
		}
		if (local24 >= 6) {
			this.anInt5831 = local20.method8555(-9372);
		} else {
			this.anInt5831 = 0;
		}
		@Pc(60) int local60 = local20.method8581(-17416);
		@Pc(69) boolean local69 = (local60 & 0x1) != 0;
		@Pc(81) boolean local81 = (local60 & 0x2) != 0;
		if (local24 < 7) {
			this.anInt5835 = local20.method8575();
		} else {
			this.anInt5835 = local20.method8561();
		}
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = -1;
		this.anIntArray387 = new int[this.anInt5835];
		@Pc(118) int local118;
		if (local24 < 7) {
			for (local118 = 0; local118 < this.anInt5835; local118++) {
				this.anIntArray387[local118] = local104 += local20.method8575();
				if (this.anIntArray387[local118] > local106) {
					local106 = this.anIntArray387[local118];
				}
			}
		} else {
			for (local118 = 0; local118 < this.anInt5835; local118++) {
				this.anIntArray387[local118] = local104 += local20.method8561();
				if (this.anIntArray387[local118] > local106) {
					local106 = this.anIntArray387[local118];
				}
			}
		}
		this.anInt5834 = local106 + 1;
		this.anIntArrayArray39 = new int[this.anInt5834][];
		this.anIntArray385 = new int[this.anInt5834];
		this.anIntArray388 = new int[this.anInt5834];
		if (local81) {
			this.aByteArrayArray11 = new byte[this.anInt5834][];
		}
		this.anIntArray386 = new int[this.anInt5834];
		this.anIntArray389 = new int[this.anInt5834];
		@Pc(260) int local260;
		if (local69) {
			this.anIntArray384 = new int[this.anInt5834];
			for (local118 = 0; local118 < this.anInt5834; local118++) {
				this.anIntArray384[local118] = -1;
			}
			for (local260 = 0; local260 < this.anInt5835; local260++) {
				this.anIntArray384[this.anIntArray387[local260]] = local20.method8555(-9372);
			}
			this.aClass272_1 = new Class272(this.anIntArray384);
		}
		for (local118 = 0; local118 < this.anInt5835; local118++) {
			this.anIntArray385[this.anIntArray387[local118]] = local20.method8555(-9372);
		}
		if (local81) {
			for (local260 = 0; local260 < this.anInt5835; local260++) {
				@Pc(330) byte[] local330 = new byte[64];
				local20.method8573(64, 0, local330);
				this.aByteArrayArray11[this.anIntArray387[local260]] = local330;
			}
		}
		for (local260 = 0; local260 < this.anInt5835; local260++) {
			this.anIntArray389[this.anIntArray387[local260]] = local20.method8555(-9372);
		}
		@Pc(414) int local414;
		@Pc(423) int local423;
		@Pc(428) int local428;
		@Pc(438) int local438;
		@Pc(440) int local440;
		@Pc(457) int local457;
		@Pc(389) int local389;
		if (local24 >= 7) {
			for (local389 = 0; local389 < this.anInt5835; local389++) {
				this.anIntArray386[this.anIntArray387[local389]] = local20.method8561();
			}
			for (local414 = 0; local414 < this.anInt5835; local414++) {
				local423 = this.anIntArray387[local414];
				local428 = this.anIntArray386[local423];
				local104 = 0;
				this.anIntArrayArray39[local423] = new int[local428];
				local438 = -1;
				for (local440 = 0; local440 < local428; local440++) {
					local457 = this.anIntArrayArray39[local423][local440] = local104 += local20.method8561();
					if (local438 < local457) {
						local438 = local457;
					}
				}
				this.anIntArray388[local423] = local438 + 1;
				if (local428 == local438 + 1) {
					this.anIntArrayArray39[local423] = null;
				}
			}
		} else {
			for (local389 = 0; local389 < this.anInt5835; local389++) {
				this.anIntArray386[this.anIntArray387[local389]] = local20.method8575();
			}
			for (local414 = 0; local414 < this.anInt5835; local414++) {
				local423 = this.anIntArray387[local414];
				local428 = this.anIntArray386[local423];
				local104 = 0;
				local438 = -1;
				this.anIntArrayArray39[local423] = new int[local428];
				for (local440 = 0; local440 < local428; local440++) {
					local457 = this.anIntArrayArray39[local423][local440] = local104 += local20.method8575();
					if (local457 > local438) {
						local438 = local457;
					}
				}
				this.anIntArray388[local423] = local438 + 1;
				if (local438 + 1 == local428) {
					this.anIntArrayArray39[local423] = null;
				}
			}
		}
		if (!local69) {
			return;
		}
		this.anIntArrayArray40 = new int[local106 + 1][];
		this.aClass272Array1 = new Class272[local106 + 1];
		for (local389 = 0; local389 < this.anInt5835; local389++) {
			local414 = this.anIntArray387[local389];
			local423 = this.anIntArray386[local414];
			this.anIntArrayArray40[local414] = new int[this.anIntArray388[local414]];
			for (local428 = 0; local428 < this.anIntArray388[local414]; local428++) {
				this.anIntArrayArray40[local414][local428] = -1;
			}
			for (local438 = 0; local438 < local423; local438++) {
				if (this.anIntArrayArray39[local414] == null) {
					local440 = local438;
				} else {
					local440 = this.anIntArrayArray39[local414][local438];
				}
				this.anIntArrayArray40[local414][local440] = local20.method8555(-9372);
			}
			this.aClass272Array1[local414] = new Class272(this.anIntArrayArray40[local414]);
		}
	}
}
