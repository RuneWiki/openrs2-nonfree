import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class283 implements Interface27 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!sr;")
	private final Class334 aClass334_2;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!as;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!sr;Lclient!as;)V")
	public Class283(@OriginalArg(0) Class334 arg0, @OriginalArg(1) Class25 arg1) {
		this.aClass334_2 = arg0;
		this.aClass25_1 = arg1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8038() {
		return this.aClass334_2.method7982();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	@Override
	public void method8040() {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8039() {
		@Pc(19) Class227 local19 = this.aClass334_2.method7981(this.aClass25_1.anInt368);
		if (local19 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass25_1.aClass318_1.method7565(this.aClass25_1.anInt366, Static339.anInt5789) + this.aClass25_1.anInt365;
		@Pc(49) int local49 = this.aClass25_1.aClass238_1.method5892(this.aClass25_1.anInt364, Static48.anInt6772) + this.aClass25_1.anInt363;
		if (this.aClass25_1.aBoolean27) {
			Static202.aClass75_5.method6701(local35, local49, this.aClass25_1.anInt366, this.aClass25_1.anInt364, this.aClass25_1.anInt360, 0);
		}
		local49 += this.method6992(Static205.aClass67_6, local19.aString66, local35, local49) * 12;
		local49 += 8;
		if (this.aClass25_1.aBoolean27) {
			Static202.aClass75_5.method6707(local35, local49, local35 + this.aClass25_1.anInt366 - 1, local49, this.aClass25_1.anInt360, 0);
		}
		local49++;
		local49 += this.method6992(Static205.aClass67_6, local19.aString67, local35, local49) * 12;
		local49 += 5;
		@Pc(136) int local136 = local49 + this.method6992(Static205.aClass67_6, local19.aString68, local35, local49) * 12;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!da;Ljava/lang/String;III)I")
	private int method6992(@OriginalArg(1) Class67 arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return arg0.method8281(arg3 + 5, this.aClass25_1.anInt370, arg2 + 5, (int[]) null, 0, this.aClass25_1.anInt364 - 10, 0, 0, 0, 0, (Class49[]) null, this.aClass25_1.anInt361, (Class1) null, this.aClass25_1.anInt366 - 10, arg1);
	}
}
