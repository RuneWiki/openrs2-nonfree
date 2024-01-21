import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class25_Sub1_Sub2 extends Class25_Sub1 implements Runnable {

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ed;Lclient!nd;)V")
	public Class25_Sub1_Sub2(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Interface2 arg1) {
		Static41.anInterface2_2 = arg1;
		Static41.anInterface2_2.method1237();
		Static41.anInterface2_2.method1239();
		this.method776((long) Static41.anInt1153);
		Static41.anInterface2_2.method1238(Static41.anIntArray136, Static41.anInt1154);
		Static41.anInt1154 = 0;
		arg0.method520(this, 10);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static41.method783(arg0, (int) arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	@Override
	public void method1150() {
		synchronized (this) {
			Static41.aBoolean56 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static41.aBoolean56) {
					break;
				}
			}
			Static74.method1220(20L);
		}
		Static41.anInterface2_2.method1235();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1157() {
		if (!Static41.aClass7_1.method194()) {
			return;
		}
		@Pc(18) long local18 = (long) (Static41.anInt1153 + 200 - Static41.anInterface2_2.method1236()) * (long) (Static41.aClass7_1.anInt355 * 1000);
		while (true) {
			while (true) {
				@Pc(21) int local21 = Static41.aClass7_1.method183();
				@Pc(26) int local26 = Static41.aClass7_1.anIntArray41[local21];
				@Pc(30) long local30 = Static41.aClass7_1.method193(local26);
				if (local30 > local18) {
					Static41.method785();
					return;
				}
				while (Static41.aClass7_1.anIntArray41[local21] == local26) {
					Static41.aClass7_1.method189(local21);
					this.method784(local21, local30);
					if (Static41.aClass7_1.method182()) {
						Static41.aClass7_1.method186(local21);
						if (Static41.aClass7_1.method184()) {
							if (!Static41.aBoolean57) {
								this.method776((long) (local30 / (long) (Static41.aClass7_1.anInt355 * 1000)));
								Static41.aClass7_1.method181();
								Static41.method785();
								return;
							}
							Static41.aClass7_1.method192(local30);
						}
						break;
					}
					Static41.aClass7_1.method188(local21);
					Static41.aClass7_1.method186(local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static41.aBoolean56) {
						Static41.aBoolean56 = false;
						return;
					}
					this.method1157();
				}
				Static74.method1220(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static69.method1187(local24, null);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIJ)V")
	private void method784(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(11) int local11 = Static41.aClass7_1.method180(arg0);
		if (local11 == 1) {
			Static41.aClass7_1.method191();
		} else if ((local11 & 0x80) != 0) {
			@Pc(30) int local30 = local11 & 0xFF;
			@Pc(39) int local39 = (int) (arg1 / (long) (Static41.aClass7_1.anInt355 * 1000));
			@Pc(45) int local45 = local11 >> 8 & 0xFF;
			@Pc(51) int local51 = local11 >> 16 & 0xFF;
			if (!this.method774(local30, local45, local51, (long) local39)) {
				Static41.method783(local30, local39, local45, local51);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	@Override
	public synchronized void method1151() {
		Static41.anInterface2_2.method1239();
		this.method776((long) Static41.anInt1153);
		Static41.anInterface2_2.method1238(Static41.anIntArray136, Static41.anInt1154);
		Static41.anInt1154 = 0;
		Static41.aClass7_1.method181();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BBZ)V")
	@Override
	public synchronized void method1154(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		Static41.aClass7_1.method187(arg1);
		@Pc(4) boolean local4 = true;
		Static41.anInt1153 = 0;
		Static41.aBoolean57 = arg2;
		Static41.anInterface2_2.method1239();
		this.method782(0, (long) Static41.anInt1153, arg0);
		@Pc(21) int local21 = Static41.aClass7_1.method178();
		for (@Pc(28) int local28 = 0; local28 < local21; local28++) {
			Static41.aClass7_1.method189(local28);
			while (!Static41.aClass7_1.method182()) {
				Static41.aClass7_1.method188(local28);
				if (Static41.aClass7_1.anIntArray41[local28] != 0) {
					local4 = false;
					break;
				}
				this.method784(local28, 0L);
			}
			Static41.aClass7_1.method186(local28);
		}
		if (local4) {
			if (Static41.aBoolean57) {
				throw new RuntimeException();
			}
			this.method776((long) Static41.anInt1153);
			Static41.aClass7_1.method181();
		}
		Static41.method785();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V")
	@Override
	public synchronized void method1156(@OriginalArg(0) int arg0) {
		this.method775((long) Static41.anInt1153, arg0);
		Static41.anInterface2_2.method1238(Static41.anIntArray136, Static41.anInt1154);
		Static41.anInt1154 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method782(arg0, (long) Static41.anInt1153, arg1);
	}
}
