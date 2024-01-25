import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public interface Interface24 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V")
	void method6799(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)I")
	int method6800();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZJ)Z")
	boolean method6801(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	void method6802();

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	void method6803();

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)I")
	int method6804();
}
