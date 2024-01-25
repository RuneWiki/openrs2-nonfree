import java.awt.Container;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class348 implements Runnable {

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "Z")
	private boolean aBoolean815;

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "Z")
	private volatile boolean aBoolean816;

	@OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
	private int anInt9866;

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!vba", name = "t", descriptor = "Ljava/lang/String;")
	private String aString110;

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "Lclient!oq;")
	private Class251 aClass251_23;

	@OriginalMember(owner = "client!vba", name = "x", descriptor = "I")
	private int anInt9870;

	@OriginalMember(owner = "client!vba", name = "z", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "Lclient!lfa;")
	private Interface15 anInterface15_1 = new Class289();

	@OriginalMember(owner = "client!vba", name = "s", descriptor = "Lclient!lfa;")
	private Interface15 anInterface15_2 = null;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Lclient!oq;")
	public Class251 method8099() {
		return this.aClass251_23;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
	public int method8100() {
		if (this.aClass251_23 == null) {
			return 0;
		}
		@Pc(13) int local13 = this.aClass251_23.method6446();
		if (this.aClass251_23.aBoolean658 && this.aClass251_23.anInt7692 > this.anInt9866) {
			return this.anInt9866 + 1;
		} else if (local13 >= 0 && Static453.aClass251Array1.length - 1 > local13) {
			return this.aClass251_23.anInt7696 == this.anInt9866 ? this.aClass251_23.anInt7692 : this.aClass251_23.anInt7696;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)V")
	public void method8103() {
		this.aBoolean816 = true;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
	public int method8104() {
		return this.anInt9866;
	}

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)Z")
	public synchronized boolean method8105() {
		return this.anInterface15_1.method7154(this.aLong257);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ljava/lang/String;Lclient!oq;IJB)V")
	public synchronized void method8106(@OriginalArg(0) String arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		this.aString110 = arg0;
		this.anInt9866 = arg2;
		this.aLong258 = arg3;
		this.aClass251_23 = arg1;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BLclient!lfa;)V")
	public synchronized void method8107(@OriginalArg(1) Interface15 arg0) {
		this.anInterface15_2 = this.anInterface15_1;
		this.anInterface15_1 = arg0;
		this.aLong257 = Static444.method6719();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
	public synchronized void method8108() {
		this.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!vba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean816) {
			@Pc(6) long local6 = Static444.method6719();
			synchronized (this) {
				try {
					this.anInt9870++;
					if (this.anInterface15_1 instanceof Class289) {
						this.anInterface15_1.method7156(this.aBoolean815);
					} else {
						@Pc(31) long local31 = Static444.method6719();
						if (Static47.aClass33_3 == null || this.anInterface15_2 == null || this.anInterface15_2.method7155() == 0 || this.aLong257 < local31 - (long) this.anInterface15_2.method7155()) {
							if (this.anInterface15_2 != null) {
								this.aBoolean815 = true;
								this.anInterface15_2.method7157();
								this.anInterface15_2 = null;
							}
							if (this.aBoolean815) {
								Static140.method3138();
								if (Static47.aClass33_3 != null) {
									Static47.aClass33_3.GA(0);
								}
							}
							this.anInterface15_1.method7156(this.aBoolean815 || Static47.aClass33_3 != null && Static47.aClass33_3.method6186());
						} else {
							@Pc(111) int local111 = (int) ((local31 - this.aLong257) * 255L / (long) this.anInterface15_2.method7155());
							@Pc(116) int local116 = 255 - local111;
							@Pc(122) int local122 = local116 << 24 | 0xFFFFFF;
							@Pc(128) int local128 = local111 << 24 | 0xFFFFFF;
							Static140.method3138();
							Static47.aClass33_3.GA(0);
							@Pc(139) Class5 local139 = Static47.aClass33_3.method6188(Static114.anInt2970, Static256.anInt5669, true);
							Static47.aClass33_3.method6150(local139);
							this.anInterface15_2.method7156(true);
							Static47.aClass33_3.method6178();
							local139.method7595(0, 0, 0, local122, 1);
							Static47.aClass33_3.method6150(local139);
							Static47.aClass33_3.GA(0);
							this.anInterface15_1.method7156(true);
							Static47.aClass33_3.method6178();
							local139.method7595(0, 0, 0, local128, 1);
						}
						try {
							if (Static47.aClass33_3 != null && !(this.anInterface15_1 instanceof Class289)) {
								Static47.aClass33_3.method6170();
							}
						} catch (@Pc(189) Exception_Sub1 local189) {
							Static544.method7724(local189.getMessage() + " (Recovered) " + Static321.aClient2.method1821(), local189);
							Static559.method7893(true, 0);
						}
					}
					@Pc(216) Container local216;
					if (Static599.aFrame141 != null) {
						local216 = Static599.aFrame141;
					} else if (Static632.anApplet2 == null) {
						local216 = Static36.anApplet_Sub1_1;
					} else {
						local216 = Static632.anApplet2;
					}
					local216.getSize();
					local216.getSize();
					if (local216 == Static599.aFrame141) {
						Static599.aFrame141.getInsets();
					}
					this.aBoolean815 = false;
					if (Static47.aClass33_3 != null && !(this.anInterface15_1 instanceof Class289) && this.aClass251_23.method6446() < Static411.aClass251_19.method6446()) {
						Static531.method7546();
					}
				} catch (@Pc(257) Exception local257) {
					continue;
				}
			}
			@Pc(269) long local269 = Static444.method6719();
			@Pc(277) int local277 = (int) (local6 + 20L - local269);
			if (local277 > 0) {
				Static500.method7308((long) local277);
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)J")
	public long method8110() {
		return this.aLong258;
	}

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method8111() {
		return this.aString110;
	}

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "(I)I")
	public int method8112() {
		return this.anInt9870;
	}
}
