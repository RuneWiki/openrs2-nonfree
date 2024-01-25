import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class319 {

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
	public int anInt8621;

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
	public int anInt8622;

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
	public int anInt8624;

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "[I")
	public int[] anIntArray583;

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!sia", name = "i", descriptor = "[I")
	public int[] anIntArray584;

	@OriginalMember(owner = "client!sia", name = "j", descriptor = "[I")
	public int[] anIntArray585;

	@OriginalMember(owner = "client!sia", name = "k", descriptor = "[Lclient!qt;")
	public Class292[] aClass292Array1;

	@OriginalMember(owner = "client!sia", name = "l", descriptor = "[[B")
	public byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!sia", name = "m", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!sia", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!sia", name = "q", descriptor = "Lclient!qt;")
	public Class292 aClass292_1;

	@OriginalMember(owner = "client!sia", name = "r", descriptor = "[I")
	public int[] anIntArray587;

	@OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
	public final int anInt8625;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "([BI[B)V")
	public Class319(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt8625 = Static601.method8116(arg0, arg0.length);
		if (this.anInt8625 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray98 = Static4.method98(arg0.length, 0, arg0);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (arg2[local44] != this.aByteArray98[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method7261(arg0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I[B)V")
	private void method7261(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub22 local12 = new Class2_Sub22(Static129.method7547(arg0));
		@Pc(16) int local16 = local12.method8547();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt8624 = local12.method8542();
		} else {
			this.anInt8624 = 0;
		}
		@Pc(47) int local47 = local12.method8547();
		@Pc(58) boolean local58 = (local47 & 0x1) != 0;
		@Pc(66) boolean local66 = (local47 & 0x2) != 0;
		this.anInt8621 = local12.method8546();
		@Pc(73) int local73 = 0;
		@Pc(75) int local75 = -1;
		this.anIntArray582 = new int[this.anInt8621];
		for (@Pc(82) int local82 = 0; local82 < this.anInt8621; local82++) {
			this.anIntArray582[local82] = local73 += local12.method8546();
			if (this.anIntArray582[local82] > local75) {
				local75 = this.anIntArray582[local82];
			}
		}
		this.anInt8622 = local75 + 1;
		this.anIntArray586 = new int[this.anInt8622];
		this.anIntArray585 = new int[this.anInt8622];
		this.anIntArray584 = new int[this.anInt8622];
		if (local66) {
			this.aByteArrayArray29 = new byte[this.anInt8622][];
		}
		this.anIntArrayArray54 = new int[this.anInt8622][];
		this.anIntArray587 = new int[this.anInt8622];
		@Pc(167) int local167;
		@Pc(181) int local181;
		if (local58) {
			this.anIntArray583 = new int[this.anInt8622];
			for (local167 = 0; local167 < this.anInt8622; local167++) {
				this.anIntArray583[local167] = -1;
			}
			for (local181 = 0; local181 < this.anInt8621; local181++) {
				this.anIntArray583[this.anIntArray582[local181]] = local12.method8542();
			}
			this.aClass292_1 = new Class292(this.anIntArray583);
		}
		for (local167 = 0; local167 < this.anInt8621; local167++) {
			this.anIntArray587[this.anIntArray582[local167]] = local12.method8542();
		}
		if (local66) {
			for (local181 = 0; local181 < this.anInt8621; local181++) {
				@Pc(239) byte[] local239 = new byte[64];
				local12.method8502(local239, 0, 64);
				this.aByteArrayArray29[this.anIntArray582[local181]] = local239;
			}
		}
		for (local181 = 0; local181 < this.anInt8621; local181++) {
			this.anIntArray585[this.anIntArray582[local181]] = local12.method8542();
		}
		for (@Pc(289) int local289 = 0; local289 < this.anInt8621; local289++) {
			this.anIntArray586[this.anIntArray582[local289]] = local12.method8546();
		}
		@Pc(321) int local321;
		@Pc(328) int local328;
		@Pc(330) int local330;
		@Pc(338) int local338;
		@Pc(355) int local355;
		for (@Pc(314) int local314 = 0; local314 < this.anInt8621; local314++) {
			local321 = this.anIntArray582[local314];
			local73 = 0;
			local328 = this.anIntArray586[local321];
			local330 = -1;
			this.anIntArrayArray54[local321] = new int[local328];
			for (local338 = 0; local338 < local328; local338++) {
				local355 = this.anIntArrayArray54[local321][local338] = local73 += local12.method8546();
				if (local330 < local355) {
					local330 = local355;
				}
			}
			this.anIntArray584[local321] = local330 + 1;
			if (local330 + 1 == local328) {
				this.anIntArrayArray54[local321] = null;
			}
		}
		if (!local58) {
			return;
		}
		this.aClass292Array1 = new Class292[local75 + 1];
		this.anIntArrayArray55 = new int[local75 + 1][];
		for (local321 = 0; local321 < this.anInt8621; local321++) {
			local328 = this.anIntArray582[local321];
			local330 = this.anIntArray586[local328];
			this.anIntArrayArray55[local328] = new int[this.anIntArray584[local328]];
			for (local338 = 0; local338 < this.anIntArray584[local328]; local338++) {
				this.anIntArrayArray55[local328][local338] = -1;
			}
			for (local355 = 0; local355 < local330; local355++) {
				@Pc(469) int local469;
				if (this.anIntArrayArray54[local328] == null) {
					local469 = local355;
				} else {
					local469 = this.anIntArrayArray54[local328][local355];
				}
				this.anIntArrayArray55[local328][local469] = local12.method8542();
			}
			this.aClass292Array1[local328] = new Class292(this.anIntArrayArray55[local328]);
		}
	}
}
