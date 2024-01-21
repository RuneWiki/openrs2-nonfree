import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class24 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(7) Class36 local7 = Static77.aClass36_7;
				@Pc(14) Class2_Sub5 local14;
				synchronized (Static77.aClass36_7) {
					local14 = (Class2_Sub5) Static77.aClass36_7.method1365();
				}
				@Pc(24) Object local24;
				if (local14 == null) {
					Static91.method1548(100L);
					local24 = Static23.anObject1;
					synchronized (Static23.anObject1) {
						if (Static42.anInt1582 >= 0) {
							Static42.anInt1582--;
						} else {
							Static42.anInt1582 = 0;
							Static23.anObject1.notifyAll();
						}
						if (Static42.anInt1582 == 0) {
							return;
						}
					}
				} else {
					local24 = Static23.anObject1;
					synchronized (Static23.anObject1) {
						if (Static42.anInt1582 < 0) {
							Static42.anInt1582 = 0;
							Static23.anObject1.notifyAll();
							return;
						}
						Static42.anInt1582 = 600;
					}
					@Pc(46) Class11_Sub1 local46 = local14.aClass11_Sub1_4;
					if (local14.anInt797 == 0) {
						local46.aClass25_1.method1074(local14.anInt786, local14.aByteArray9, local14.aByteArray9.length);
					} else {
						@Pc(76) int local76;
						if (local14.anInt797 == 1) {
							@Pc(180) int local180 = local14.anInt786;
							@Pc(186) byte[] local186 = local46.aClass25_1.method1071(local180);
							if (local186 != null) {
								Static80.aCRC32_2.reset();
								Static80.aCRC32_2.update(local186, 0, local186.length - 2);
								local76 = (int) Static80.aCRC32_2.getValue();
								@Pc(223) int local223 = ((local186[local186.length - 2] & 0xFF) << 8) + (local186[local186.length - 1] & 0xFF);
								if (local46.anIntArray72[local180] != local76 || local46.anIntArray70[local180] != local223) {
									local186 = null;
								}
							}
							if (local186 == null) {
								local46.aBooleanArray11[local180] = false;
							} else {
								local46.aByteArrayArray3[local180] = local186;
							}
						} else if (local14.anInt797 == 2) {
							@Pc(66) Object local66 = Static87.anObject4;
							synchronized (Static87.anObject4) {
								local46.aBooleanArray11 = new boolean[local46.aByteArrayArray3.length];
								for (local76 = 0; local76 < local46.aByteArrayArray3.length; local76++) {
									local46.aBooleanArray11[local76] = false;
									@Pc(89) byte[] local89 = local46.aClass25_1.method1071(local76);
									if (local89 != null && local89.length > 2) {
										Static80.aCRC32_2.reset();
										Static80.aCRC32_2.update(local89, 0, local89.length - 2);
										@Pc(111) int local111 = (int) Static80.aCRC32_2.getValue();
										@Pc(131) int local131 = (local89[local89.length - 1] & 0xFF) + ((local89[local89.length - 2] & 0xFF) << 8);
										if (local46.anIntArray72[local76] == local111 && local131 == local46.anIntArray70[local76]) {
											local46.aBooleanArray11[local76] = true;
										}
									}
								}
							}
							local66 = Static42.anObject2;
							synchronized (Static42.anObject2) {
								local46.aBoolean36 = true;
							}
						}
					}
					@Pc(271) Class36 local271 = Static77.aClass36_7;
					synchronized (Static77.aClass36_7) {
						local14.method1695();
					}
				}
			}
		} catch (@Pc(316) Exception local316) {
			Static57.method1692(null, local316);
		}
	}
}
