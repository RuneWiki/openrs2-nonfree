import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class204 implements Runnable {

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "Lclient!qia;")
	private Class289 aClass289_1;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
	private volatile boolean aBoolean539 = true;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Z")
	private volatile boolean aBoolean541 = true;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "[Lclient!gu;")
	private final Class5_Sub18[] aClass5_Sub18Array6 = new Class5_Sub18[8];

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "Z")
	private volatile boolean aBoolean540 = false;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "[I")
	private final int[] anIntArray344 = new int[3];

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
	private final int anInt6101;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "Lclient!ha;")
	private final Class65 aClass65_10;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1) {
		this.anInt6101 = arg0;
		this.aClass65_10 = arg1;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
	private void method5073() {
		this.aClass65_10.method6956(this.anInt6101);
		while (!this.aBoolean539 && this.aBoolean541) {
			if (this.aClass289_1 == null || this.aClass289_1.method6860()) {
				this.aBoolean540 = false;
				this.aLong157 = Static178.aClass85_1.method4957();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean540 = true;
				@Pc(21) Class28 local21 = this.aClass289_1.method6857();
				if (local21 instanceof Class28_Sub1) {
					@Pc(27) Class28_Sub1 local27 = (Class28_Sub1) local21;
					if (local27.aBoolean913) {
						local27.method8962(Static10.aClass65_1);
					} else {
						Static56.method745(local27, this.aClass5_Sub18Array6);
						if (Static635.aClass73_16 != null) {
							Static635.aClass73_16.method5773(local27.anInt10778, -256, this.aClass289_1.aString78, local27.anInt10783, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class28_Sub2) local21).anInt2687;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class109 local70 = Static495.aClass109Array4[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static187.anInt6996 + Static187.anInt6996; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static187.anInt6996 + Static187.anInt6996; local75++) {
								if (Static376.aBooleanArrayArrayArray11[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static57.anInt852 + local72 - Static187.anInt6996;
									@Pc(98) int local98 = Static481.anInt8080 + local75 - Static187.anInt6996;
									if (local92 >= 0 && local92 < local70.anInt9061 && local98 >= 0 && local98 < local70.anInt9065) {
										Static10.aClass65_1.H(local92 << Static588.anInt9672, local70.method7695(local98, local92), local98 << Static588.anInt9672, this.anIntArray344);
										if (Static27.method337(this.anIntArray344[0]) == this.anInt6101 - 1) {
											local70.method7697(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass65_10.method6958(this.anInt6101);
		while (this.aBoolean539 && this.aBoolean541) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
	public void method5074() {
		this.aBoolean539 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "()V")
	public void method5075() {
		this.aBoolean539 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "()J")
	public long method5076() {
		return this.aLong157;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!qia;)V")
	public void method5077(@OriginalArg(0) Class289 arg0) {
		if (this.aClass289_1 != null) {
			this.aClass289_1.method6858((Class204) null);
		}
		this.aClass289_1 = arg0;
		if (this.aClass289_1 != null) {
			this.aClass289_1.method6858(this);
		}
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "()V")
	public void method5078() {
		this.aBoolean539 = false;
		this.aBoolean541 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "()Z")
	public boolean method5079() {
		return this.aClass289_1 == null || !this.aBoolean540 && this.aClass289_1.method6860();
	}

	@OriginalMember(owner = "client!kv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean541) {
			this.method5073();
		}
	}
}
