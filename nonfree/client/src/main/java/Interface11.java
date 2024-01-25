import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public interface Interface11 {

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLclient!gw;)V")
	void method7422(@OriginalArg(1) Class123 arg0);

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(I)V")
	void method7423();
}
