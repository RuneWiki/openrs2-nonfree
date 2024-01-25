import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class239 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!mca;")
	public Class3_Sub33_Sub1 aClass3_Sub33_Sub1_1;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!hn;")
	public Class3_Sub22_Sub1 aClass3_Sub22_Sub1_1;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "Lclient!ob;")
	public Class3_Sub36 aClass3_Sub36_1;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!pr;")
	public Class292 aClass292_1;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
	public final int anInt7046;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public final int anInt7043;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	public int anInt7040;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "B")
	public final byte aByte108;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	public final int anInt7039;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	public final int anInt7041;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	public final int anInt7042;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "Lclient!bla;")
	public final Class19_Sub1 aClass19_Sub1_15;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(BIIIIIILclient!bla;)V")
	public Class239(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class19_Sub1 arg7) {
		this.anInt7046 = arg2;
		this.anInt7043 = arg4;
		this.anInt7040 = arg3;
		this.aByte108 = arg0;
		this.anInt7039 = arg6;
		this.anInt7041 = arg1;
		this.anInt7042 = arg5;
		this.aClass19_Sub1_15 = arg7;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)Z")
	public boolean method5906() {
		return this.aByte108 == 2 || this.aByte108 == 3;
	}
}
