import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "Z")
	public boolean aBoolean415;

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!kea", name = "r", descriptor = "Z")
	public boolean aBoolean418;

	@OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
	public final int anInt5432;

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
	public final int anInt5430;

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "Z")
	public final boolean aBoolean417;

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "Lclient!cfa;")
	public final Class52_Sub1 aClass52_Sub1_1;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(ILclient!cfa;IZ)V")
	public Class2_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class52_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5432 = arg2;
		this.anInt5430 = arg0;
		this.aBoolean417 = arg3;
		this.aClass52_Sub1_1 = arg1;
	}
}
