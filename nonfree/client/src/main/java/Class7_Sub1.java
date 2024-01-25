import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "[Lclient!gs;")
	public static final Class93[] aClass93Array1 = new Class93[5];

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "J")
	public long aLong7;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
	public boolean aBoolean14;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "C")
	public char aChar1;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass93Array1.length; local4++) {
			aClass93Array1[local4] = new Class93();
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)I")
	@Override
	public int method140() {
		return this.anInt147;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)I")
	@Override
	public int method138() {
		return this.anInt149;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)C")
	@Override
	public char method136() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)J")
	@Override
	public long method134() {
		return this.aLong7;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method142() {
		return this.aBoolean14;
	}
}
