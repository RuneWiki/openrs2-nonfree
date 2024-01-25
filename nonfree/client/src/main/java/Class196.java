import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class196 implements Interface18 {

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
	public final int anInt5424;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "Z")
	public final boolean aBoolean394;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Lclient!cf;")
	public final Class56 aClass56_10;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
	public final int anInt5413;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
	public final int anInt5416;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	public final int anInt5415;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
	public final int anInt5423;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "Lclient!ur;")
	public final Class356 aClass356_7;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	public final int anInt5418;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	public final int anInt5421;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	public final int anInt5417;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILclient!ur;Lclient!cf;IIIIIIIZ)V")
	public Class196(@OriginalArg(0) int arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5424 = arg7;
		this.aBoolean394 = arg10;
		this.aClass56_10 = arg2;
		this.anInt5413 = arg9;
		this.anInt5416 = arg3;
		this.anInt5415 = arg6;
		this.anInt5423 = arg4;
		this.aClass356_7 = arg1;
		this.anInt5418 = arg0;
		this.anInt5421 = arg8;
		this.anInt5417 = arg5;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static150.aClass146_21;
	}
}
