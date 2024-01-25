import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cha")
public final class Class59 {

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!cha", name = "c", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!cha", name = "d", descriptor = "J")
	public long aLong39;

	@OriginalMember(owner = "client!cha", name = "e", descriptor = "I")
	public int anInt1344;

	@OriginalMember(owner = "client!cha", name = "f", descriptor = "I")
	public int anInt1345;

	@OriginalMember(owner = "client!cha", name = "g", descriptor = "I")
	public int anInt1346;

	@OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
	public int anInt1347;

	@OriginalMember(owner = "client!cha", name = "i", descriptor = "I")
	public int anInt1348;

	@OriginalMember(owner = "client!cha", name = "n", descriptor = "I")
	public int anInt1352;

	@OriginalMember(owner = "client!cha", name = "q", descriptor = "I")
	public int anInt1355;

	@OriginalMember(owner = "client!cha", name = "r", descriptor = "I")
	private int anInt1356;

	@OriginalMember(owner = "client!cha", name = "m", descriptor = "I")
	public int anInt1351 = 0;

	@OriginalMember(owner = "client!cha", name = "k", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!cha", name = "t", descriptor = "I")
	public int anInt1358 = 0;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V")
	public void method1375() {
		this.anInt1346 = Class3_Sub20.anIntArray204[this.anInt1356 << 3];
		@Pc(21) long local21 = (long) this.anInt1352;
		@Pc(25) long local25 = (long) this.anInt1343;
		@Pc(29) long local29 = (long) this.anInt1342;
		this.anInt1348 = (int) Math.sqrt((double) (local29 * local29 + local25 * local25 + local21 * local21));
		if (this.anInt1347 == 0) {
			this.anInt1347 = 1;
		}
		if (this.anInt1345 == 0) {
			this.aLong39 = 2147483647L;
		} else if (this.anInt1345 == 1) {
			this.aLong39 = (long) (this.anInt1348 * 8 / this.anInt1347);
			this.aLong39 *= this.aLong39;
		} else if (this.anInt1345 == 2) {
			this.aLong39 = (long) (this.anInt1348 * 8 / this.anInt1347);
		}
		if (this.aBoolean93) {
			this.anInt1348 *= -1;
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILclient!jp;I)V")
	private void method1377(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt1356 = arg1.method8593();
		} else if (arg0 == 2) {
			arg1.method8632();
		} else if (arg0 == 3) {
			this.anInt1352 = arg1.method8618();
			this.anInt1343 = arg1.method8618();
			this.anInt1342 = arg1.method8618();
		} else if (arg0 == 4) {
			this.anInt1345 = arg1.method8632();
			this.anInt1347 = arg1.method8618();
		} else if (arg0 == 6) {
			this.anInt1355 = arg1.method8632();
		} else if (arg0 == 8) {
			this.anInt1351 = 1;
		} else if (arg0 == 9) {
			this.anInt1358 = 1;
		} else if (arg0 == 10) {
			this.aBoolean93 = true;
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BLclient!jp;)V")
	public void method1381(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8632();
			if (local14 == 0) {
				return;
			}
			this.method1377(local14, arg0);
		}
	}
}
