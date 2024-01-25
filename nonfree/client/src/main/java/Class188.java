import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public abstract class Class188 implements Interface17 {

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "Lclient!da;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "J")
	private long aLong237;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	private int anInt8846;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!nd;")
	private final Class238 aClass238_248;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Lclient!ci;")
	protected final Class56 aClass56_5;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "Lclient!nd;")
	protected final Class238 aClass238_249;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;Lclient!ci;)V")
	protected Class188(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass238_248 = arg1;
		this.aClass56_5 = arg2;
		this.aClass238_249 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method8062() {
		@Pc(11) Class183 local11 = Static427.method6221(this.aClass56_5.anInt9415, this.aClass238_248);
		this.aClass37_9 = Static141.aClass13_27.method8136(local11, Static654.method3454(this.aClass238_249, this.aClass56_5.anInt9415));
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method8064() {
		@Pc(18) int local18 = this.aClass56_5.aClass97_15.method2304(this.aClass56_5.anInt9422, Static143.anInt2998) + this.aClass56_5.anInt9417;
		@Pc(37) int local37 = this.aClass56_5.aClass252_11.method6014(this.aClass56_5.anInt9414, Static478.anInt7732) + this.aClass56_5.anInt9419;
		this.method7582(local37, local18);
		this.method7581(local37, local18);
		@Pc(53) String local53 = Static113.aClass23_1.method622();
		if (Static48.method1203() - this.aLong237 > 10000L) {
			local53 = local53 + " (" + Static113.aClass23_1.method617().method1309() + ")";
		}
		this.aClass37_9.method6075(local18 + this.aClass56_5.anInt9422 / 2, -1, this.aClass56_5.anInt9412, this.aClass56_5.anInt9421 + local37 + this.aClass56_5.anInt9414 / 2 + 4, local53);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZBII)V")
	protected abstract void method7581(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIZI)V")
	protected abstract void method7582(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8063() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass238_249.method5568(this.aClass56_5.anInt9415)) {
			local10 = false;
		}
		if (!this.aClass238_248.method5568(this.aClass56_5.anInt9415)) {
			local10 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)I")
	protected final int method7583() {
		@Pc(14) int local14 = Static113.aClass23_1.method616();
		@Pc(18) int local18 = local14 * 100;
		if (this.anInt8846 == local14 && local14 != 0) {
			@Pc(35) int local35 = Static113.aClass23_1.method619();
			if (local35 > local14) {
				@Pc(50) long local50 = this.aLong237 - Static113.aClass23_1.method615();
				if (local50 > 0L) {
					@Pc(69) long local69 = local50 * 10000L / (long) local14 * (long) (local35 - local14);
					@Pc(78) long local78 = (Static48.method1203() - this.aLong237) * 10000L;
					if (local78 >= local69) {
						local18 = local35 * 100;
					} else {
						local18 = (int) ((long) (local14 * 100) + (long) (local35 - local14) * 100L * local78 / local69);
					}
				}
			}
		} else {
			this.anInt8846 = local14;
			this.aLong237 = Static48.method1203();
		}
		return local18;
	}
}
