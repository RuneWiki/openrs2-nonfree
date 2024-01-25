import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class2_Sub4_Sub3 extends Class2_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "[C")
	private static final char[] aCharArray5 = new char[64];

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!lga;")
	public Class2_Sub4 aClass2_Sub4_3;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray5[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray5[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray5[local36] = (char) (local36 - 4);
		}
		aCharArray5[63] = '-';
		aCharArray5[62] = '*';
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIILclient!lga;)V")
	public Class2_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub4 arg5) {
		super(arg2, arg3, arg4, Static481.method7379(arg0, arg1));
		this.aClass2_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return 0;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass2_Sub4_3.method8385(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return 0;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}
}
