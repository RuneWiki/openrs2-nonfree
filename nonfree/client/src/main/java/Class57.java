import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class57 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public int anInt1317;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	public int anInt1318;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public int anInt1319;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	private int anInt1321;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	private int anInt1322;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt1323;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt1324;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private int anInt1325;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "I")
	private int anInt1320 = 2;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
	private int[] anIntArray171 = new int[2];

	@OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
	private int[] anIntArray172 = new int[2];

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class57() {
		this.anIntArray171[0] = 0;
		this.anIntArray171[1] = 65535;
		this.anIntArray172[0] = 0;
		this.anIntArray172[1] = 65535;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method1261() {
		this.anInt1323 = 0;
		this.anInt1324 = 0;
		this.anInt1322 = 0;
		this.anInt1325 = 0;
		this.anInt1321 = 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!lk;)V")
	public void method1262(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt1319 = arg0.method4240();
		this.anInt1317 = arg0.method4239();
		this.anInt1318 = arg0.method4239();
		this.method1264(arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
	public int method1263(@OriginalArg(0) int arg0) {
		if (this.anInt1321 >= this.anInt1323) {
			this.anInt1325 = this.anIntArray172[this.anInt1324++] << 15;
			if (this.anInt1324 >= this.anInt1320) {
				this.anInt1324 = this.anInt1320 - 1;
			}
			this.anInt1323 = (int) ((double) this.anIntArray171[this.anInt1324] / 65536.0D * (double) arg0);
			if (this.anInt1323 > this.anInt1321) {
				this.anInt1322 = ((this.anIntArray172[this.anInt1324] << 15) - this.anInt1325) / (this.anInt1323 - this.anInt1321);
			}
		}
		this.anInt1325 += this.anInt1322;
		this.anInt1321++;
		return this.anInt1325 - this.anInt1322 >> 15;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Lclient!lk;)V")
	public void method1264(@OriginalArg(0) Class2_Sub13 arg0) {
		this.anInt1320 = arg0.method4240();
		this.anIntArray171 = new int[this.anInt1320];
		this.anIntArray172 = new int[this.anInt1320];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1320; local16++) {
			this.anIntArray171[local16] = arg0.method4245();
			this.anIntArray172[local16] = arg0.method4245();
		}
	}
}
