import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class Class10 implements Interface24 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public final int anInt10594;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!dg;")
	public final Class81 aClass81_17;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!pf;")
	public final Class275 aClass275_17;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	public final int anInt10602;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public final int anInt10598;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public final int anInt10597;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public final int anInt10596;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public final int anInt10595;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public final int anInt10601;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!pf;Lclient!dg;IIIIIII)V")
	public Class10(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10594 = arg4;
		this.aClass81_17 = arg1;
		this.aClass275_17 = arg0;
		this.anInt10602 = arg3;
		this.anInt10598 = arg6;
		this.anInt10597 = arg2;
		this.anInt10596 = arg8;
		this.anInt10595 = arg5;
		this.anInt10601 = arg7;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return null;
	}
}
