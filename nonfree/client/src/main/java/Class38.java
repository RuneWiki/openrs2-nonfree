import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class Class38 implements Interface9 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public final int anInt8024;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public final int anInt8023;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!ja;")
	public final Class154 aClass154_12;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public final int anInt8020;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!mea;")
	public final Class201 aClass201_13;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public final int anInt8022;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public final int anInt8021;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public final int anInt8017;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public final int anInt8019;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!ja;Lclient!mea;IIIIIII)V")
	public Class38(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8024 = arg7;
		this.anInt8023 = arg8;
		this.aClass154_12 = arg0;
		this.anInt8020 = arg4;
		this.aClass201_13 = arg1;
		this.anInt8022 = arg6;
		this.anInt8021 = arg2;
		this.anInt8017 = arg3;
		this.anInt8019 = arg5;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return null;
	}
}
