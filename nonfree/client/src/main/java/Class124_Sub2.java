import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public class Class124_Sub2 extends Class124 {

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Lclient!fd;")
	private Class103 aClass103_38;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "Lclient!fd;")
	private Class103 aClass103_39;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "Lclient!fd;")
	private Class103 aClass103_40;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "Lclient!fd;")
	private Class103 aClass103_41;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "Lclient!fd;")
	protected Class103 aClass103_42;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "Lclient!fd;")
	private Class103 aClass103_43;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!ria;)V")
	public Class124_Sub2(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class35_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZB)V")
	@Override
	protected final void method6755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.aClass103_39.method7454() + arg1;
		@Pc(26) int local26 = super.aClass35_5.anInt9053 + arg1 - this.aClass103_41.method7454();
		@Pc(32) int local32 = arg0 + this.aClass103_43.method7451();
		@Pc(42) int local42 = super.aClass35_5.anInt9046 + arg0 - this.aClass103_38.method7451();
		@Pc(47) int local47 = local26 - local15;
		@Pc(51) int local51 = local42 - local32;
		@Pc(61) int local61 = local47 * this.method6756() / 10000;
		@Pc(64) int[] local64 = new int[4];
		Static266.aClass82_8.K(local64);
		Static266.aClass82_8.KA(local15, local32, local15 + local61, local42);
		this.method6758(local47, local51, local15, local32);
		Static266.aClass82_8.KA(local15 + local61, local32, local26, local42);
		this.aClass103_40.method7455(local15, local32, local47, local51);
		Static266.aClass82_8.KA(local64[0], local64[1], local64[2], local64[3]);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBII)V")
	protected void method6758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass103_42.method7455(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public final void method8107() {
		super.method8107();
		@Pc(16) Class35_Sub1 local16 = (Class35_Sub1) super.aClass35_5;
		this.aClass103_42 = Static209.method3272(super.aClass343_213, local16.anInt838);
		this.aClass103_40 = Static209.method3272(super.aClass343_213, local16.anInt837);
		this.aClass103_39 = Static209.method3272(super.aClass343_213, local16.anInt836);
		this.aClass103_41 = Static209.method3272(super.aClass343_213, local16.anInt834);
		this.aClass103_43 = Static209.method3272(super.aClass343_213, local16.anInt829);
		this.aClass103_38 = Static209.method3272(super.aClass343_213, local16.anInt827);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8109() {
		if (!super.method8109()) {
			return false;
		}
		@Pc(13) Class35_Sub1 local13 = (Class35_Sub1) super.aClass35_5;
		if (!super.aClass343_213.method8138(local13.anInt838)) {
			return false;
		} else if (!super.aClass343_213.method8138(local13.anInt837)) {
			return false;
		} else if (!super.aClass343_213.method8138(local13.anInt836)) {
			return false;
		} else if (!super.aClass343_213.method8138(local13.anInt834)) {
			return false;
		} else if (super.aClass343_213.method8138(local13.anInt829)) {
			return super.aClass343_213.method8138(local13.anInt827);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method6753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static266.aClass82_8.K(local12);
		Static266.aClass82_8.KA(arg1, arg0, arg1 + super.aClass35_5.anInt9053, arg0 + super.aClass35_5.anInt9046);
		@Pc(33) int local33 = this.aClass103_39.method7454();
		@Pc(37) int local37 = this.aClass103_39.method7451();
		@Pc(41) int local41 = this.aClass103_41.method7454();
		@Pc(45) int local45 = this.aClass103_41.method7451();
		this.aClass103_39.method7462(arg1, (super.aClass35_5.anInt9046 - local37) / 2 + arg0);
		this.aClass103_41.method7462(super.aClass35_5.anInt9053 + arg1 - local41, (super.aClass35_5.anInt9046 + -local45) / 2 + arg0);
		Static266.aClass82_8.KA(arg1, arg0, arg1 + super.aClass35_5.anInt9053, this.aClass103_43.method7451() + arg0);
		this.aClass103_43.method7455(local33 + arg1, arg0, super.aClass35_5.anInt9053 - local33 - local41, super.aClass35_5.anInt9046);
		@Pc(118) int local118 = this.aClass103_38.method7451();
		Static266.aClass82_8.KA(arg1, super.aClass35_5.anInt9046 + arg0 - local118, super.aClass35_5.anInt9053 + arg1, super.aClass35_5.anInt9046 + arg0);
		this.aClass103_38.method7455(arg1 + local33, super.aClass35_5.anInt9046 + (arg0 - local118), super.aClass35_5.anInt9053 - local41 - local33, super.aClass35_5.anInt9046);
		Static266.aClass82_8.KA(local12[0], local12[1], local12[2], local12[3]);
	}
}
