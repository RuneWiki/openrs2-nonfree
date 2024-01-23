import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class173 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	public int anInt5484;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
	private int anInt5493;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	private int anInt5483 = 128;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	private int anInt5485 = 128;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
	public int anInt5489 = -1;

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
	private int anInt5490 = 0;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
	private int anInt5494 = 0;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "Z")
	public boolean aBoolean380 = false;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
	private int anInt5497 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method4449(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3915();
			if (local9 == 0) {
				return;
			}
			this.method4450(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!ug;)V")
	private void method4450(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt5493 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt5489 = arg1.method3948();
		} else if (arg0 == 4) {
			this.anInt5483 = arg1.method3948();
		} else if (arg0 == 5) {
			this.anInt5485 = arg1.method3948();
		} else if (arg0 == 6) {
			this.anInt5494 = arg1.method3948();
		} else if (arg0 == 7) {
			this.anInt5497 = arg1.method3915();
		} else if (arg0 == 8) {
			this.anInt5490 = arg1.method3915();
		} else if (arg0 == 9) {
			this.aBoolean379 = true;
		} else if (arg0 == 10) {
			this.aBoolean380 = true;
		} else {
			@Pc(88) int local88;
			@Pc(98) int local98;
			if (arg0 == 40) {
				local88 = arg1.method3915();
				this.aShortArray89 = new short[local88];
				this.aShortArray92 = new short[local88];
				for (local98 = 0; local98 < local88; local98++) {
					this.aShortArray89[local98] = (short) arg1.method3948();
					this.aShortArray92[local98] = (short) arg1.method3948();
				}
			} else if (arg0 == 41) {
				local88 = arg1.method3915();
				this.aShortArray90 = new short[local88];
				this.aShortArray91 = new short[local88];
				for (local98 = 0; local98 < local88; local98++) {
					this.aShortArray90[local98] = (short) arg1.method3948();
					this.aShortArray91[local98] = (short) arg1.method3948();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBI)Lclient!hm;")
	public Class10_Sub4 method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class10_Sub4 local24 = (Class10_Sub4) Static53.aClass98_48.method2570((long) this.anInt5484);
		if (local24 == null) {
			@Pc(33) Class10_Sub3 local33 = Static46.method722(Static224.aClass155_121, this.anInt5493);
			if (local33 == null) {
				return null;
			}
			@Pc(45) int local45;
			if (this.aShortArray89 != null) {
				for (local45 = 0; local45 < this.aShortArray89.length; local45++) {
					local33.method728(this.aShortArray89[local45], this.aShortArray92[local45]);
				}
			}
			if (this.aShortArray90 != null) {
				for (local45 = 0; local45 < this.aShortArray90.length; local45++) {
					local33.method719(this.aShortArray90[local45], this.aShortArray91[local45]);
				}
			}
			local24 = local33.method717(this.anInt5497 + 64, this.anInt5490 + 850, -30, -50, -30);
			Static53.aClass98_48.method2568(local24, (long) this.anInt5484);
		}
		@Pc(129) Class10_Sub4 local129;
		if (this.anInt5489 == -1 || arg0 == -1) {
			local129 = local24.method1962(true, true, true);
		} else {
			local129 = Static253.method4288(this.anInt5489).method354(arg0, arg2, local24, arg1);
		}
		if (this.anInt5483 != 128 || this.anInt5485 != 128) {
			local129.method1960(this.anInt5483, this.anInt5485, this.anInt5483);
		}
		if (this.anInt5494 != 0) {
			if (this.anInt5494 == 90) {
				local129.method1950();
			}
			if (this.anInt5494 == 180) {
				local129.method1942();
			}
			if (this.anInt5494 == 270) {
				local129.method1956();
			}
		}
		return local129;
	}
}
