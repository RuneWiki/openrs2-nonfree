import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class Class94 implements Interface14 {

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "I")
	public final int anInt8269;

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
	public final int anInt8263;

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
	public final int anInt8262;

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
	public final int anInt8265;

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
	public final int anInt8267;

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
	public final int anInt8268;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "I")
	public final int anInt8266;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "Lclient!ia;")
	public final Class140 aClass140_15;

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "Lclient!sc;")
	public final Class300 aClass300_13;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!sc;Lclient!ia;IIIIIII)V")
	public Class94(@OriginalArg(0) Class300 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8269 = arg7;
		this.anInt8263 = arg4;
		this.anInt8262 = arg5;
		this.anInt8265 = arg3;
		this.anInt8267 = arg8;
		this.anInt8268 = arg6;
		this.anInt8266 = arg2;
		this.aClass140_15 = arg1;
		this.aClass300_13 = arg0;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return null;
	}
}
