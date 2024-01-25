import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public abstract class Class120 implements Interface13 {

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "J")
	private long aLong288;

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "Lclient!da;")
	private Class56 aClass56_17;

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
	private int anInt10200;

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "Lclient!lh;")
	protected final Class103 aClass103_5;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "Lclient!bt;")
	protected final Class34 aClass34_131;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "Lclient!bt;")
	private final Class34 aClass34_130;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;Lclient!lh;)V")
	protected Class120(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class103 arg2) {
		this.aClass103_5 = arg2;
		this.aClass34_131 = arg0;
		this.aClass34_130 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
	@Override
	public void method8638() {
		@Pc(15) Class31 local15 = Static662.method8784(this.aClass34_130, this.aClass103_5.anInt8641);
		this.aClass56_17 = Static582.aClass33_13.method8081(local15, Static682.method1652(this.aClass34_131, this.aClass103_5.anInt8641));
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method8637() {
		@Pc(17) int local17 = this.aClass103_5.aClass291_14.method6524(Static606.anInt9314, this.aClass103_5.anInt8646) + this.aClass103_5.anInt8643;
		@Pc(32) int local32 = this.aClass103_5.aClass125_16.method2842(this.aClass103_5.anInt8653, Static353.anInt5368) + this.aClass103_5.anInt8650;
		this.method8643(local17, local32);
		this.method8642(local17, local32);
		@Pc(56) String local56 = Static31.aClass353_3.method7675();
		if (Static429.method5935() - this.aLong288 > 10000L) {
			local56 = local56 + " (" + Static31.aClass353_3.method7686().method5071() + ")";
		}
		this.aClass56_17.method8054(local56, -1, this.aClass103_5.anInt8644, this.aClass103_5.anInt8653 / 2 + local32 + this.aClass103_5.anInt8648 + 4, this.aClass103_5.anInt8646 / 2 + local17);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8636() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass34_131.method1235(this.aClass103_5.anInt8641)) {
			local5 = false;
		}
		if (!this.aClass34_130.method1235(this.aClass103_5.anInt8641)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I")
	protected final int method8641() {
		@Pc(15) int local15 = Static31.aClass353_3.method7688();
		@Pc(19) int local19 = local15 * 100;
		if (this.anInt10200 == local15 && local15 != 0) {
			@Pc(33) int local33 = Static31.aClass353_3.method7679();
			if (local15 < local33) {
				@Pc(47) long local47 = this.aLong288 - Static31.aClass353_3.method7676();
				if (local47 > 0L) {
					@Pc(66) long local66 = (long) (local33 - local15) * (local47 * 10000L / (long) local15);
					@Pc(75) long local75 = (Static429.method5935() - this.aLong288) * 10000L;
					if (local75 >= local66) {
						local19 = local33 * 100;
					} else {
						local19 = (int) ((long) (local33 - local15) * local75 * 100L / local66 + (long) (local15 * 100));
					}
				}
			}
		} else {
			this.anInt10200 = local15;
			this.aLong288 = Static429.method5935();
		}
		return local19;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZII)V")
	protected abstract void method8642(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZIB)V")
	protected abstract void method8643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
