import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class157_Sub1 extends Class157 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "J")
	public long aLong194;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!ua;")
	public Class157_Sub1 aClass157_Sub1_4;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public int anInt6109;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public int anInt6110;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Z")
	public boolean aBoolean452;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
	@Override
	public int method5189() {
		return this.anInt6110;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)J")
	@Override
	public long method5191() {
		return this.aLong194;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
	@Override
	public int method5193() {
		return this.anInt6109;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5192() {
		return this.aBoolean452;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)C")
	@Override
	public char method5190() {
		return this.aChar4;
	}
}
