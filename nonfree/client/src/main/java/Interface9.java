import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public interface Interface9 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)I")
	int method9102();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	void method9103();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Z")
	boolean method9104();

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	int method9105();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLclient!ha;)V")
	void method9106(@OriginalArg(1) Class22 arg0);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)I")
	int method9107();

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(BLclient!ha;)V")
	void method9108(@OriginalArg(1) Class22 arg0);
}
