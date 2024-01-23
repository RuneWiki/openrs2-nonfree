import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class12 {

	@OriginalMember(owner = "client!b", name = "E", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public int anInt384 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public int anInt382 = -1;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	public int anInt383 = -1;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	public int anInt391 = -1;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	public int anInt386 = -1;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	public int anInt397 = -1;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	public int anInt401 = -1;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public int anInt392 = -1;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	public int anInt390 = 0;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public int anInt388 = 0;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "I")
	public int anInt400 = 0;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "I")
	public int anInt395 = 0;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	public int anInt396 = 0;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	public int anInt409 = 0;

	@OriginalMember(owner = "client!b", name = "M", descriptor = "I")
	public int anInt415 = 0;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "I")
	public int anInt410 = -1;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "I")
	public int anInt407 = -1;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "I")
	public int anInt413 = -1;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "I")
	public int anInt408 = -1;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "I")
	public int anInt394 = -1;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	public int anInt405 = 0;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "I")
	public int anInt421 = -1;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "I")
	public int anInt422 = -1;

	@OriginalMember(owner = "client!b", name = "P", descriptor = "I")
	public int anInt418 = -1;

	@OriginalMember(owner = "client!b", name = "N", descriptor = "I")
	public int anInt416 = -1;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
	public int anInt419 = -1;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "I")
	public int anInt412 = 0;

	@OriginalMember(owner = "client!b", name = "U", descriptor = "I")
	public int anInt423 = -1;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	public int anInt399 = -1;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	public int anInt411 = 0;

	@OriginalMember(owner = "client!b", name = "L", descriptor = "I")
	public int anInt414 = -1;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "I")
	public int anInt426 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public void method281() {
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!aj;Z)V")
	private void method284(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt423 = arg1.method2375();
			this.anInt383 = arg1.method2375();
			if (this.anInt423 == 65535) {
				this.anInt423 = -1;
			}
			if (this.anInt383 == 65535) {
				this.anInt383 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt408 = arg1.method2375();
		} else if (arg0 == 3) {
			this.anInt386 = arg1.method2375();
		} else if (arg0 == 4) {
			this.anInt394 = arg1.method2375();
		} else if (arg0 == 5) {
			this.anInt416 = arg1.method2375();
		} else if (arg0 == 6) {
			this.anInt421 = arg1.method2375();
		} else if (arg0 == 7) {
			this.anInt399 = arg1.method2375();
		} else if (arg0 == 8) {
			this.anInt397 = arg1.method2375();
		} else if (arg0 == 9) {
			this.anInt413 = arg1.method2375();
		} else if (arg0 == 26) {
			this.anInt405 = (short) (arg1.method2334() * 4);
			this.anInt396 = (short) (arg1.method2334() * 4);
		} else if (arg0 == 27) {
			if (this.anIntArrayArray2 == null) {
				this.anIntArrayArray2 = new int[12][];
			}
			@Pc(368) int local368 = arg1.method2334();
			this.anIntArrayArray2[local368] = new int[6];
			for (@Pc(376) int local376 = 0; local376 < 6; local376++) {
				this.anIntArrayArray2[local368][local376] = arg1.method2360();
			}
		} else if (arg0 == 29) {
			this.anInt409 = arg1.method2334();
		} else if (arg0 == 30) {
			this.anInt412 = arg1.method2375();
		} else if (arg0 == 31) {
			this.anInt390 = arg1.method2334();
		} else if (arg0 == 32) {
			this.anInt415 = arg1.method2375();
		} else if (arg0 == 33) {
			this.anInt411 = arg1.method2360();
		} else if (arg0 == 34) {
			this.anInt395 = arg1.method2334();
		} else if (arg0 == 35) {
			this.anInt400 = arg1.method2375();
		} else if (arg0 == 36) {
			this.anInt388 = arg1.method2360();
		} else if (arg0 == 37) {
			this.anInt382 = arg1.method2334();
		} else if (arg0 == 38) {
			this.anInt392 = arg1.method2375();
		} else if (arg0 == 39) {
			this.anInt384 = arg1.method2375();
		} else if (arg0 == 40) {
			this.anInt422 = arg1.method2375();
		} else if (arg0 == 41) {
			this.anInt407 = arg1.method2375();
		} else if (arg0 == 42) {
			this.anInt401 = arg1.method2375();
		} else if (arg0 == 43) {
			arg1.method2375();
		} else if (arg0 == 44) {
			arg1.method2375();
		} else if (arg0 == 45) {
			arg1.method2375();
		} else if (arg0 == 46) {
			this.anInt426 = arg1.method2375();
		} else if (arg0 == 47) {
			this.anInt414 = arg1.method2375();
		} else if (arg0 == 48) {
			this.anInt419 = arg1.method2375();
		} else if (arg0 == 49) {
			this.anInt418 = arg1.method2375();
		} else if (arg0 == 50) {
			this.anInt410 = arg1.method2375();
		} else if (arg0 == 51) {
			this.anInt391 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!aj;I)V")
	public void method285(@OriginalArg(0) Class8_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2334();
			if (local9 == 0) {
				return;
			}
			this.method284(local9, arg0);
		}
	}
}
