import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class14_Sub1_Sub2 extends Class14_Sub1 implements Runnable {

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!lc;Lclient!db;)V")
	public Class14_Sub1_Sub2(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Interface1 arg1) {
		Static49.anInterface1_1 = arg1;
		Static49.anInterface1_1.method587();
		Static49.anInterface1_1.method590();
		this.method1093((long) Static49.anInt1624);
		Static49.anInterface1_1.method586(Static49.anIntArray165, Static49.anInt1625);
		Static49.anInt1625 = 0;
		arg0.method1262(10, this);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1078() {
		if (!Static49.aClass17_1.method650()) {
			return;
		}
		@Pc(23) long local23 = (long) (Static49.anInt1624 + 200 - Static49.anInterface1_1.method589()) * (long) (Static49.aClass17_1.anInt961 * 1000);
		while (true) {
			while (true) {
				@Pc(26) int local26 = Static49.aClass17_1.method643();
				@Pc(31) int local31 = Static49.aClass17_1.anIntArray98[local26];
				@Pc(35) long local35 = Static49.aClass17_1.method644(local31);
				if (local35 > local23) {
					Static49.method1097();
					return;
				}
				while (local31 == Static49.aClass17_1.anIntArray98[local26]) {
					Static49.aClass17_1.method658(local26);
					this.method1096(local35, local26);
					if (Static49.aClass17_1.method651()) {
						Static49.aClass17_1.method653(local26);
						if (Static49.aClass17_1.method656()) {
							if (!Static49.aBoolean90) {
								this.method1093((long) (local35 / (long) (Static49.aClass17_1.anInt961 * 1000)));
								Static49.aClass17_1.method648();
								Static49.method1097();
								return;
							}
							Static49.aClass17_1.method652(local35);
						}
						break;
					}
					Static49.aClass17_1.method647(local26);
					Static49.aClass17_1.method653(local26);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(JBI)V")
	private void method1096(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static49.aClass17_1.method645(arg1);
		if (local11 == 1) {
			Static49.aClass17_1.method657();
		} else if ((local11 & 0x80) != 0) {
			@Pc(33) int local33 = (int) (arg0 / (long) (Static49.aClass17_1.anInt961 * 1000));
			@Pc(37) int local37 = local11 & 0xFF;
			@Pc(43) int local43 = local11 >> 8 & 0xFF;
			@Pc(49) int local49 = local11 >> 16 & 0xFF;
			if (!this.method1094(local37, local43, local49, (long) local33)) {
				Static49.method1098(local43, local49, local33, local37);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static49.aBoolean89) {
						Static49.aBoolean89 = false;
						return;
					}
					this.method1078();
				}
				Static72.method1367(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static10.method1681(null, local24);
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
	@Override
	public void method1082() {
		synchronized (this) {
			Static49.aBoolean89 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static49.aBoolean89) {
					break;
				}
			}
			Static72.method1367(20L);
		}
		Static49.anInterface1_1.method588();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BZII)V")
	@Override
	public synchronized void method1076(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(6) boolean local6 = true;
		Static49.aClass17_1.method649(arg0);
		Static49.anInt1624 = 0;
		Static49.aBoolean90 = arg1;
		Static49.anInterface1_1.method590();
		this.method1089(arg2, 0, (long) Static49.anInt1624);
		@Pc(26) int local26 = Static49.aClass17_1.method646();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			Static49.aClass17_1.method658(local28);
			while (!Static49.aClass17_1.method651()) {
				Static49.aClass17_1.method647(local28);
				if (Static49.aClass17_1.anIntArray98[local28] != 0) {
					local6 = false;
					break;
				}
				this.method1096(0L, local28);
			}
			Static49.aClass17_1.method653(local28);
		}
		if (local6) {
			if (Static49.aBoolean90) {
				throw new RuntimeException();
			}
			this.method1093((long) Static49.anInt1624);
			Static49.aClass17_1.method648();
		}
		Static49.method1097();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	@Override
	public synchronized void method1077(@OriginalArg(0) int arg0) {
		this.method1090((long) Static49.anInt1624, arg0);
		Static49.anInterface1_1.method586(Static49.anIntArray165, Static49.anInt1625);
		Static49.anInt1625 = 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static49.method1098(arg1, arg2, (int) arg3, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)V")
	@Override
	public synchronized void method1080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method1089(arg0, arg1, (long) Static49.anInt1624);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1079() {
		Static49.anInterface1_1.method590();
		this.method1093((long) Static49.anInt1624);
		Static49.anInterface1_1.method586(Static49.anIntArray165, Static49.anInt1625);
		Static49.anInt1625 = 0;
		Static49.aClass17_1.method648();
	}
}
