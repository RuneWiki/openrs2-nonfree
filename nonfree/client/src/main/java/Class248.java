import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class248 {

	@OriginalMember(owner = "client!nea", name = "s", descriptor = "Lclient!fia;")
	public Class115 aClass115_1;

	@OriginalMember(owner = "client!nea", name = "p", descriptor = "Lclient!jg;")
	public Class5_Sub27_Sub1 aClass5_Sub27_Sub1_3;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "Lclient!gga;")
	public Class5_Sub22 aClass5_Sub22_3;

	@OriginalMember(owner = "client!nea", name = "q", descriptor = "Lclient!it;")
	public Class5_Sub4_Sub4 aClass5_Sub4_Sub4_3;

	@OriginalMember(owner = "client!nea", name = "j", descriptor = "I")
	public final int anInt6529;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "I")
	public final int anInt6536;

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
	public final int anInt6537;

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "Lclient!rda;")
	public final Class4_Sub1 aClass4_Sub1_16;

	@OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
	public final int anInt6528;

	@OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
	public int anInt6530;

	@OriginalMember(owner = "client!nea", name = "n", descriptor = "I")
	public final int anInt6532;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(BIIIIIILclient!rda;)V")
	public Class248(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4_Sub1 arg7) {
		this.anInt6529 = arg1;
		this.aByte88 = arg0;
		this.anInt6536 = arg6;
		this.anInt6537 = arg2;
		this.aClass4_Sub1_16 = arg7;
		this.anInt6528 = arg4;
		this.anInt6530 = arg3;
		this.anInt6532 = arg5;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z")
	public boolean method5709() {
		return this.aByte88 == 2 || this.aByte88 == 3;
	}
}
